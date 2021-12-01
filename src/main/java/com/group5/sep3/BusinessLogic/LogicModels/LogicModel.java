package com.group5.sep3.BusinessLogic.LogicModels;
import java.util.Collection;

public interface LogicModel<TEntity> {

    TEntity register(TEntity entity) throws Exception;

    TEntity update(TEntity entity) throws Exception;

    Collection<TEntity> getAll() throws Exception;

    TEntity get(TEntity entity) throws Exception;

    TEntity remove(TEntity entity) throws Exception;

}
