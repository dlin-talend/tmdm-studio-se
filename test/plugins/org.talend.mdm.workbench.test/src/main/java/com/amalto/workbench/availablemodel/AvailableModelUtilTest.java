package com.amalto.workbench.availablemodel;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class AvailableModelUtilTest {

    @Test
    public void testGetAvailableModels() {
        List<IAvailableModel> availableModels = AvailableModelUtil.getAvailableModels();
        assertNotNull(availableModels);
        assertEquals(11, availableModels.size());
    }

    @Test
    public void testGetAvailableModelsBoolean() {
        List<IAvailableModel> availableModels = AvailableModelUtil.getAvailableModels(true);
        assertNotNull(availableModels);
        assertEquals(6, availableModels.size());

        availableModels = AvailableModelUtil.getAvailableModels(false);
        assertNotNull(availableModels);
        assertEquals(6, availableModels.size());
    }

}
