// This class was generated by the JAXRPC SI, do not edit.
// Contents subject to change without notice.
// JAX-RPC Standard Implementation ��1.1.2_01������� R40��
// Generated source version: 1.1.2

package com.amalto.workbench.webservices;

import com.sun.xml.rpc.encoding.*;
import com.sun.xml.rpc.encoding.xsd.XSDConstants;
import com.sun.xml.rpc.encoding.literal.*;
import com.sun.xml.rpc.encoding.literal.DetailFragmentDeserializer;
import com.sun.xml.rpc.encoding.simpletype.*;
import com.sun.xml.rpc.encoding.soap.SOAPConstants;
import com.sun.xml.rpc.encoding.soap.SOAP12Constants;
import com.sun.xml.rpc.streaming.*;
import com.sun.xml.rpc.wsdl.document.schema.SchemaConstants;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.ArrayList;

public class WSVersioningGetInfo_LiteralSerializer extends LiteralObjectSerializerBase implements Initializable  {
    private static final QName ns1_versioningSystemName_QNAME = new QName("", "versioningSystemName");
    private static final QName ns3_string_TYPE_QNAME = SchemaConstants.QNAME_TYPE_STRING;
    private CombinedSerializer ns3_myns3_string__java_lang_String_String_Serializer;
    
    public WSVersioningGetInfo_LiteralSerializer(QName type, String encodingStyle) {
        this(type, encodingStyle, false);
    }
    
    public WSVersioningGetInfo_LiteralSerializer(QName type, String encodingStyle, boolean encodeType) {
        super(type, true, encodingStyle, encodeType);
    }
    
    public void initialize(InternalTypeMappingRegistry registry) throws Exception {
        ns3_myns3_string__java_lang_String_String_Serializer = (CombinedSerializer)registry.getSerializer("", java.lang.String.class, ns3_string_TYPE_QNAME);
    }
    
    public Object doDeserialize(XMLReader reader,
        SOAPDeserializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSVersioningGetInfo instance = new com.amalto.workbench.webservices.WSVersioningGetInfo();
        Object member=null;
        QName elementName;
        List values;
        Object value;
        
        reader.nextElementContent();
        elementName = reader.getName();
        if (reader.getState() == XMLReader.START) {
            if (elementName.equals(ns1_versioningSystemName_QNAME)) {
                member = ns3_myns3_string__java_lang_String_String_Serializer.deserialize(ns1_versioningSystemName_QNAME, reader, context);
                instance.setVersioningSystemName((java.lang.String)member);
                reader.nextElementContent();
            } else {
                throw new DeserializationException("literal.unexpectedElementName", new Object[] { ns1_versioningSystemName_QNAME, reader.getName() });
            }
        }
        else {
            throw new DeserializationException("literal.expectedElementName", reader.getName().toString());
        }
        
        XMLReaderUtil.verifyReaderState(reader, XMLReader.END);
        return (Object)instance;
    }
    
    public void doSerializeAttributes(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSVersioningGetInfo instance = (com.amalto.workbench.webservices.WSVersioningGetInfo)obj;
        
    }
    public void doSerialize(Object obj, XMLWriter writer, SOAPSerializationContext context) throws Exception {
        com.amalto.workbench.webservices.WSVersioningGetInfo instance = (com.amalto.workbench.webservices.WSVersioningGetInfo)obj;
        
        ns3_myns3_string__java_lang_String_String_Serializer.serialize(instance.getVersioningSystemName(), ns1_versioningSystemName_QNAME, null, writer, context);
    }
}