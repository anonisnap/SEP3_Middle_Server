package com.group5.sep3.BusinessLogic.LogicModels;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public interface EntityLogicModel<TEntity> extends LogicModel{

    TEntity register(TEntity entity) throws Exception;

    TEntity get(int entity) throws Exception;

    TEntity update(TEntity entity) throws Exception;

    ArrayList<TEntity> getAll() throws Exception;

    boolean remove(int entity) throws Exception;

}
