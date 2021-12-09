package com.group5.sep3.BusinessLogic.LogicModels;
import java.util.Collection;

public interface EntityLogicModel<TEntity> extends LogicModel{

    TEntity register(TEntity entity) throws Exception;

    TEntity get(int entity) throws Exception;

    TEntity update(TEntity entity) throws Exception;

    Collection<TEntity> getAll() throws Exception;

    boolean remove(int entity) throws Exception;

}
