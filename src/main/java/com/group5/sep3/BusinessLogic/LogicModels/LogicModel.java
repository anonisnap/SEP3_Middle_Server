package com.group5.sep3.BusinessLogic.LogicModels;
import java.util.Collection;

public interface LogicModel<TEntity> {

    TEntity register(TEntity entity) throws Exception;

    TEntity get(int entityId) throws Exception;

    TEntity update(TEntity entity) throws Exception;

    Collection<TEntity> getAll() throws Exception;

    boolean remove(int entityId) throws Exception;

}
