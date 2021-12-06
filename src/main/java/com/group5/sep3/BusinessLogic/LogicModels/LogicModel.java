package com.group5.sep3.BusinessLogic.LogicModels;
import java.util.Collection;
import java.util.List;

public interface LogicModel<TEntity> {

    TEntity register(TEntity entity) throws Exception;

    TEntity get(TEntity entity) throws Exception;

    TEntity update(TEntity entity) throws Exception;

    List<TEntity> getAll() throws Exception;

    TEntity remove(TEntity entity) throws Exception;

}
