package mx.bidg.dao;

import java.io.Serializable;
import java.util.List;

public interface InterfaceDao<T extends Serializable> {
    T save(T entity);
    T update(T entity);
    T findById(int id);
    List<T> findAll();
    boolean delete(T entity);
}
