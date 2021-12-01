package com.group5.sep3;

import com.group5.sep3.BusinessLogic.LogicModels.impl.ItemModelImpl;
import com.group5.sep3.BusinessLogic.model.Item;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

public class ModelTest {


    @Test
    public void testItemModel(){
        ItemModelImpl itemModel = new ItemModelImpl();

        Collection<Item> items = itemModel.getAll();

        Assertions.assertNotNull(items);
    }



}
