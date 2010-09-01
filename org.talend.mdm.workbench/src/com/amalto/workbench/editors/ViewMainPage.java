/*
 * Created on 27 oct. 2005
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.amalto.workbench.editors;

import java.lang.reflect.InvocationTargetException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.text.ITextListener;
import org.eclipse.jface.text.TextEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DragSource;
import org.eclipse.swt.dnd.DragSourceEvent;
import org.eclipse.swt.dnd.DragSourceListener;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.DropTargetListener;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xsd.XSDSchema;

import com.amalto.workbench.dialogs.XpathSelectDialog;
import com.amalto.workbench.models.Line;
import com.amalto.workbench.models.TreeObject;
import com.amalto.workbench.providers.XObjectEditorInput;
import com.amalto.workbench.utils.Util;
import com.amalto.workbench.utils.XtentisException;
import com.amalto.workbench.webservices.WSBoolean;
import com.amalto.workbench.webservices.WSConceptKey;
import com.amalto.workbench.webservices.WSDataModel;
import com.amalto.workbench.webservices.WSDataModelPK;
import com.amalto.workbench.webservices.WSGetBusinessConceptKey;
import com.amalto.workbench.webservices.WSGetDataModel;
import com.amalto.workbench.webservices.WSGetTransformerPKs;
import com.amalto.workbench.webservices.WSGetView;
import com.amalto.workbench.webservices.WSTransformerPK;
import com.amalto.workbench.webservices.WSTransformerPKArray;
import com.amalto.workbench.webservices.WSView;
import com.amalto.workbench.webservices.WSViewPK;
import com.amalto.workbench.webservices.WSWhereCondition;
import com.amalto.workbench.webservices.XtentisPort;
import com.amalto.workbench.widgets.ComplexTableViewerColumn;
import com.amalto.workbench.widgets.DescAnnotationComposite;
import com.amalto.workbench.widgets.TisTableViewer;

public class ViewMainPage extends AMainPageV2 implements ITextListener{
    
	protected DescAnnotationComposite desAntionComposite ;
	protected DropTarget windowTarget;
	
	private boolean refreshing = false;
	private boolean comitting = false;
	private String lastDataModelName = null;
	private String viewName=null;
	private String concept;
	
	private ComplexTableViewerColumn[] viewableElementColumns = new ComplexTableViewerColumn[]{
			new ComplexTableViewerColumn("XPath", false, "newXPath", "newXPath", "",ComplexTableViewerColumn.XPATH_STYLE,new String[] {},0)
	};
	private TisTableViewer viewableViewer;
	
	
	private ComplexTableViewerColumn[] searchableElementColumns = new ComplexTableViewerColumn[]{
			new ComplexTableViewerColumn("XPath", false, "newXPath", "newXPath", "",ComplexTableViewerColumn.XPATH_STYLE,new String[] {},0)
	};
	private TisTableViewer searchableViewer;
	private Button btnRunProcess;
	private Combo cboProcessList;
	
	
/*    private ComplexTableViewerColumn[] conditionsColumns= new ComplexTableViewerColumn[]{
    		new ComplexTableViewerColumn("XPath", false, "newXPath", "newXPath", "",ComplexTableViewerColumn.XPATH_STYLE,new String[] {},0),
    		new ComplexTableViewerColumn("Operator", false, "", "", "",ComplexTableViewerColumn.COMBO_STYLE,IConstants.VIEW_CONDITION_OPERATORS,0),
    		new ComplexTableViewerColumn("Value", false, "", ""),
    		new ComplexTableViewerColumn("Predicate", true, "", "", "",ComplexTableViewerColumn.COMBO_STYLE,IConstants.PREDICATES,0),
    };*/
//	private TisTableViewer conditionViewer;
	
    
    public ViewMainPage(FormEditor editor) {
        super(
        		editor,
        		ViewMainPage.class.getName(),
        		"View "+((XObjectEditorInput)editor.getEditorInput()).getName()
        		+Util.getRevision((TreeObject)((XObjectEditorInput)editor.getEditorInput()).getModel())
        );     
//       this.treeParent = this.getXObject().getParent();
       this.viewName = ((XObjectEditorInput)editor.getEditorInput()).getName();

    }
   
	protected void createCharacteristicsContent(FormToolkit toolkit, Composite charComposite) {
		
        try {
        	desAntionComposite = new DescAnnotationComposite("Description" ," ...", toolkit, charComposite, (AMainPageV2)this,false);
        	Composite comp=toolkit.createComposite(charComposite);
    		GridLayout layout=new GridLayout(2, false);
    		layout.marginWidth=0;
    		layout.marginLeft=0;
    		layout.marginTop=0;
    		layout.marginHeight=0;
    		layout.marginBottom=0;
        	comp.setLayout(layout);
        	btnRunProcess=toolkit.createButton(comp, "Run the view result through a Process", SWT.CHECK);
        	btnRunProcess.setLayoutData(new GridData(SWT.LEFT,SWT.TOP,true,true,1,1));
        	cboProcessList=new Combo(comp, SWT.READ_ONLY |SWT.DROP_DOWN|SWT.SINGLE);
        	cboProcessList.setLayoutData(new GridData(SWT.LEFT,SWT.TOP,true,true,1,1));
        	java.util.List<String> pList=new ArrayList<String>();
        	WSTransformerPKArray array=Util.getPort(getXObject()).getTransformerPKs(new WSGetTransformerPKs(""));  
        	if(array!=null && array.getWsTransformerPK()!=null) {
	        	for(WSTransformerPK pk:array.getWsTransformerPK()) {
	        		pList.add(pk.getPk());
	        	}
        	}
        	cboProcessList.setItems((String[])pList.toArray(new String[pList.size()]));
        	
        	//add listener
        	btnRunProcess.addSelectionListener(new SelectionListener() {
				
				public void widgetSelected(SelectionEvent e) {
					cboProcessList.setEnabled(btnRunProcess.getSelection());
					markDirtyWithoutCommit();
				}
				
				public void widgetDefaultSelected(SelectionEvent e) {
					cboProcessList.setEnabled(btnRunProcess.getSelection());
					markDirtyWithoutCommit();					
				}
			});
        	cboProcessList.addModifyListener(new ModifyListener() {
				
				public void modifyText(ModifyEvent e) {
					markDirtyWithoutCommit();						
				}
			});
            //make the Page window a DropTarget - we need to dispose it
            windowTarget = new DropTarget(this.getPartControl(), DND.DROP_MOVE);
            windowTarget.setTransfer(new Transfer[]{TextTransfer.getInstance()});
            windowTarget.addDropListener(new DCDropTargetListener());
            
            /****
            /viewable Business Elements
            ****/
            
            Composite viewablehGroup  = this.getNewSectionComposite("Viewable Business Elements");
            viewablehGroup.setLayout(new GridLayout(2,false));
            viewableElementColumns[0].setColumnWidth(220);
            viewableViewer = new TisTableViewer(Arrays.asList(viewableElementColumns),toolkit,viewablehGroup);
            viewableViewer.setXpath(true);
            if(viewName.startsWith("Browse_items_")) {
            	concept = viewName.replaceAll("Browse_items_","").replaceAll("#.*","");
            }
            viewableViewer.setConceptName(concept);
            viewableViewer.setMainPage(this);
            viewableViewer.setAddMulti(true);
            viewableViewer.create();
            viewableViewer.setHeight(110);
            //wrap.Wrap(this, viewableViewer);
            
            
            Composite searchGroup  = this.getNewSectionComposite("Searchable Business Elements");
            searchGroup.setLayout(new GridLayout(2,false));
            searchableElementColumns[0].setColumnWidth(220);
            searchableViewer = new TisTableViewer(Arrays.asList(searchableElementColumns),toolkit,searchGroup);
            searchableViewer.setXpath(true);
            searchableViewer.setConceptName(concept);
            searchableViewer.setMainPage(this);
            searchableViewer.setAddMulti(true);
            searchableViewer.create();            
            searchableViewer.setHeight(110);
            //wrap.Wrap(this, searchableViewer);
            
            
            //Where Conditions
            if(viewName.startsWith("Browse_items_"))
            	setCompositeView(false);
    		else
    			setCompositeView(true);
            initCoditionsColumns();
            Composite wcGroup = this.getNewSectionComposite("Where Conditions");
            wcGroup.setLayout(new GridLayout(2,false));
            conditionsColumns[0].setColumnWidth(250);
            conditionsColumns[1].setColumnWidth(150);
            conditionsColumns[2].setColumnWidth(250);
            conditionsColumns[3].setColumnWidth(120);
            conditionViewer=new TisTableViewer(Arrays.asList(conditionsColumns),toolkit,wcGroup);
            conditionViewer.setXpath(true);
            conditionViewer.setConceptName(concept);
            conditionViewer.setMainPage(this);
            conditionViewer.setAddMulti(true);
            conditionViewer.create();
            conditionViewer.setHeight(110);
            
//            wrap.Wrap(this, conditionViewer);
            
            refreshData();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//createCharacteristicsContent


	protected void refreshData() {
		try {
			
			if (this.comitting) return;
			
			this.refreshing = true;
			
			WSView wsObject = getWsViewObject();
			
			desAntionComposite.setText(wsObject.getDescription()==null ? "" : wsObject.getDescription());
	    	
            btnRunProcess.setSelection(wsObject.getIsTransformerActive().is_true());
            if(btnRunProcess.getSelection()) {
            	cboProcessList.setEnabled(true);
            	cboProcessList.setText(wsObject.getTransformerPK());
            }else {
            	cboProcessList.setEnabled(false);
            	cboProcessList.setText("");
            }
            
            java.util.List<Line> vlines = new ArrayList<Line>();
            String[] vis = wsObject.getViewableBusinessElements();
            if(vis != null){
            	for(String vi : vis){
            		String strings[] = new String[]{vi};
            		Line line = new Line(viewableElementColumns,strings);
            		vlines.add(line);
            	}
            }
            viewableViewer.getViewer().setInput(vlines);
            
            
            
            java.util.List<Line> slines = new ArrayList<Line>();
            String[] ses = wsObject.getSearchableBusinessElements();
            if(ses != null){
            	 for(String se:ses){
                 	String strings[] = new String[]{se}; 
                 	Line line = new Line(searchableElementColumns,strings);
                 	slines.add(line);
                 }
            }
            searchableViewer.getViewer().setInput(slines);
            
            java.util.List<Line> lines=new ArrayList<Line>();
            for(WSWhereCondition wc:wsObject.getWhereConditions()){
				Line line=new Line(
						conditionsColumns,
						Util.convertWhereCondition(wc)
					);
				lines.add(line);
            }
            conditionViewer.getViewer().setInput(lines);
            this.refreshing = false;

		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(this.getSite().getShell(), "Error refreshing the page", "Error refreshing the page: "+e.getLocalizedMessage());
		}    	
	}

	private WSView getWsViewObject(){
		WSView wsObject = null;
		try {
			if (getXObject().getWsObject() == null) { //then fetch from server			
				
				XtentisPort	port = Util.getPort(getXObject());
				
				wsObject = 
					port.getView(
							new WSGetView(
								(WSViewPK)getXObject().getWsKey()
							)
					);
				getXObject().setWsObject(wsObject);
			} else { //it has been opened by an editor - use the object there
				wsObject = (WSView)getXObject().getWsObject();
			}
		} catch (XtentisException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return wsObject;
	}
	
	protected void commit() {
		try {
			
			if (this.refreshing) return;
			
			this.comitting = true;
			
	    	WSView wsObject = (WSView) (getWsViewObject());
			wsObject.setDescription(desAntionComposite.getText());
			wsObject.setIsTransformerActive(new WSBoolean(btnRunProcess.getSelection()));
			wsObject.setTransformerPK(cboProcessList.getText());
			java.util.List<Line> vlines = (java.util.List<Line>) viewableViewer.getViewer().getInput();
			String[] vvs = new String[vlines.size()];
			for(int j=0;j<vlines.size();j++){
				Line item  = vlines.get(j);
				vvs[j]=item.keyValues.get(0).value;
			}
			wsObject.setViewableBusinessElements(vvs);
			
			
			java.util.List<Line> slines = (java.util.List<Line>) searchableViewer.getViewer().getInput();
			String[] svs = new String[slines.size()];
			
			for(int j=0;j<slines.size();j++){
				Line item  = slines.get(j);
				svs[j]=item.keyValues.get(0).value;
			}
			wsObject.setSearchableBusinessElements(svs);
			
			
			
			java.util.List<Line> lines=(java.util.List<Line>)conditionViewer.getViewer().getInput();
			java.util.List<WSWhereCondition> wclist=new ArrayList<WSWhereCondition>();
			for(Line item: lines){
				String[] values=new String[]{item.keyValues.get(0).value,
						item.keyValues.get(1).value,
						item.keyValues.get(2).value,
						item.keyValues.get(3).value};
				WSWhereCondition wc =Util.convertLine(values);
				wclist.add(wc);
			}
			wsObject.setWhereConditions(wclist.toArray(new WSWhereCondition[wclist.size()]));
			
			this.comitting = false;
			
		} catch (Exception e) {
			e.printStackTrace();
			MessageDialog.openError(this.getSite().getShell(), "Error comtiting the page", "Error comitting the page: "+e.getLocalizedMessage());
		}    	
	}
	

	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		if(this.viewName!=null&&this.viewName.length()>0){
			if(viewName.matches("Browse_items.*")){
				lastDataModelName=XpathSelectDialog.getDataModelName();
				String concept = viewName.replaceAll("Browse_items_","").replaceAll("#.*","");
				
				//edit by ymli;fix the bug:0011970:if the conceptName of Browse_items_conceptName doesn't exist in datamodel,do not valiate the id.
				java.util.List<String> systemDataModelValues = Util.getChildren(this.getXObject().getServerRoot(), TreeObject.DATA_MODEL);
				ArrayList<String> avaiList=new ArrayList<String>();
				avaiList.addAll(systemDataModelValues);
				if(concept!=null && !concept.contains("*")){
					for(String datamodel: systemDataModelValues){
						try {
							WSDataModel dm=Util.getPort(this.getXObject()).getDataModel(new WSGetDataModel(new WSDataModelPK(datamodel)));
							if(dm!=null){
								XSDSchema xsdSchema = Util.getXSDSchema(dm.getXsdSchema());
								String schema = Util.nodeToString(xsdSchema.getDocument());
								XSDSchema xsd= Util.createXsdSchema(schema, this.getXObject().getServerRoot());
								if(!Util.getConcepts(xsd).contains(concept)){
									avaiList.remove(datamodel);
								}
							}
						} catch (Exception e1) {
							e1.printStackTrace();
						} 
					}
				}
				if(concept!=null&&concept.length()>0&&lastDataModelName!=null&&lastDataModelName.length()>0 && avaiList.size()>0){
				//if(concept!=null&&concept.length()>0&&lastDataModelName!=null&&lastDataModelName.length()>0){
					
					//keys validate
					java.util.List<String> toAddViewableList=new ArrayList<String>();
					
					WSGetBusinessConceptKey wsGetBusinessConceptKey=new WSGetBusinessConceptKey(new WSDataModelPK(lastDataModelName),concept);
					WSConceptKey wsConceptKey = null;
					try {
						wsConceptKey = Util.getPort(getXObject()).getBusinessConceptKey(wsGetBusinessConceptKey);
					} catch (RemoteException e) {
						e.printStackTrace();
					} catch (XtentisException e) {
						e.printStackTrace();
					}
					
					if(wsConceptKey!=null){

						java.util.List<String> viewableList=new ArrayList<String>();
						java.util.List<Line> vlines = (java.util.List<Line>) viewableViewer.getViewer().getInput();
						for(int j=0;j<vlines.size();j++){
							Line item  = vlines.get(j);
							viewableList.add(item.keyValues.get(0).value);
						}
						
						
						String[] keys = wsConceptKey.getFields();
						for (int i = 0; i < keys.length; i++) {
							if(".".equals(wsConceptKey.getSelector()))
								keys[i] = "/"+concept+"/"+keys[i];					
							else
								keys[i] = wsConceptKey.getSelector()+keys[i];
						}
						
						String[] ids=wsConceptKey.getFields();
						for (int i = 0; i < ids.length; i++) {
							String id=ids[i];
							
							//need to care about more case
							if(id.startsWith("/")){
								id=id.substring(1);
							}else if(id.startsWith("//")){
								id=id.substring(2);
							}
							
							if(!viewableList.contains(id)){
								toAddViewableList.add(0,id);
							}
						}
					}
					//show verify report
					if(toAddViewableList.size()>0){
						
						String msg="[Missing Unique Key]: \n\n";
						for (Iterator iterator = toAddViewableList.iterator(); iterator.hasNext();) {
							String toAddItem = (String) iterator.next();
							msg+=(toAddItem+"\n");
						}
						msg+="\nSystem will add these key-paths for you automatically.\n";
						
						MessageDialog.openInformation(this.getSite().getShell(), "Verify Report", msg);
					}
					
					//auto fix
					IRunnableWithProgress autoFixProcess = new AutoFixProgress(toAddViewableList, viewableViewer, this.getSite().getShell());

					try {
						new ProgressMonitorDialog(this.getSite().getShell()).run(
								false,	
								true, 
								autoFixProcess
						);
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		}
	    
	}
		
	protected void createActions() {
	}


	public void textChanged(TextEvent event) {
		markDirtyWithoutCommit();
	}

	
	public void dispose() {
		super.dispose();
		windowTarget.dispose();
	}
	
	//description text listener
	public void modifyText(ModifyEvent e) {
		if (this.refreshing) return;
		super.modifyText(e);
	}

	/****************************************************************************
	 *   DND
	 ****************************************************************************/
	
	class DCDragSourceListener implements DragSourceListener {
		private int selected;

		public void dragFinished(DragSourceEvent event) {
			Control control = ((DragSource)event.widget).getControl();
			if ((control instanceof List) && ((event.detail & DND.DROP_MOVE) == DND.DROP_MOVE)) {
				((List)control).remove(selected);
				markDirtyWithoutCommit();
			}
		}

		public void dragSetData(DragSourceEvent event) {
			Control control = ((DragSource)event.widget).getControl();
			if ((control instanceof List))
				if (TextTransfer.getInstance().isSupportedType(event.dataType)) {
					this.selected = ((List)control).getSelectionIndex();
					event.data =  ((List)control).getSelection()[0];
				}
		}

		public void dragStart(DragSourceEvent event) {
			Control control = ((DragSource)event.widget).getControl();
			if ((control instanceof List))
				event.doit = (((List)control).getItemCount()>0);
		}
	}
	
	class DCDropTargetListener implements DropTargetListener {

		public void dragEnter(DropTargetEvent event) {
			//priority to copy
			if ((event.operations & DND.DROP_COPY) == DND.DROP_COPY)
				event.detail = DND.DROP_COPY;
			else if ((event.operations & DND.DROP_MOVE) == DND.DROP_MOVE)
				event.detail = DND.DROP_MOVE;
			else	
				event.detail = DND.DROP_NONE;
		}
		public void dragLeave(DropTargetEvent event) {}
		public void dragOperationChanged(DropTargetEvent event) {}
		public void dragOver(DropTargetEvent event) {}
		public void drop(DropTargetEvent event) {
			Control control = ((DropTarget)event.widget).getControl();
			if ((control instanceof List) && ((event.operations & DND.DROP_COPY) == DND.DROP_COPY))
				if (TextTransfer.getInstance().isSupportedType(event.currentDataType)) 
					if (!Arrays.asList(((List)control).getItems()).contains(event.data)) {
							((List)control).add((String)event.data);
							ViewMainPage.this.markDirtyWithoutCommit();
					}
		}
		public void dropAccept(DropTargetEvent event) {}
		
	}

	
	
	/**
	 * @author stakey
	 *
	 */
	class AutoFixProgress implements IRunnableWithProgress {
		
		java.util.List<String> toAddViewableList;
		TisTableViewer viewableBEsList;
		Shell parentShell;
		
		public AutoFixProgress(java.util.List<String> toAddViewableList,TisTableViewer viewableBEsList, Shell shell) {
			super();
			this.toAddViewableList = toAddViewableList;
			this.viewableBEsList = viewableBEsList;
			this.parentShell = shell;
		}

		public void run(IProgressMonitor monitor)
				throws InvocationTargetException, InterruptedException {
			try {
				monitor.beginTask("Adding key-path", toAddViewableList.size());
								
				for (Iterator<String> iter = toAddViewableList.iterator(); iter.hasNext(); ) {
					String[] keyPath = new String[]{iter.next()};
					Line line = new Line(viewableElementColumns,keyPath);
					java.util.List<Line> vlines = (java.util.List<Line>) viewableViewer.getViewer().getInput();
					vlines.add(line);					
					commit();
					monitor.worked(1);
				}//for
				
				monitor.done();
			} catch (Exception e) {
				e.printStackTrace();
				MessageDialog.openError(
						parentShell,
						"Error Auto Fix", 
						"An error occured trying to fix issues automatically:\n\n "+e.getLocalizedMessage()
				);
			}//try	
		}
		
	}
	 public boolean equals(WSWhereCondition wcObj, WSWhereCondition obj) {
		if (wcObj.getLeftPath().equals(obj.getLeftPath())
				&& wcObj.getOperator().getValue().equals(obj.getOperator().getValue())
				&& wcObj.getRightValueOrPath().equals(obj.getRightValueOrPath())
				&& wcObj.getStringPredicate().getValue().equals(obj.getStringPredicate().getValue()))
			return true;
		else
			return false;
	}
	 
	@Override
	public boolean beforeDoSave() {
		if(desAntionComposite.getText().trim().equals(""))
		{
			MessageDialog.openError(this.getSite().getShell(), "Error saving", "Description cannot be empty");
			return false;
		}
		WSView wsObject = (WSView) (getWsViewObject());
//		if(wsObject.getViewableBusinessElements().length==0) {
//			MessageDialog.openError(this.getSite().getShell(), "Error","Viewable Business Elements can't be empty!");
//			return false;
//		}
		if(wsObject.getSearchableBusinessElements().length==0) {
			MessageDialog.openError(this.getSite().getShell(), "Error","Searchable Business Elements can't be empty!");
			return false;
		}		
		return true;
	}
}