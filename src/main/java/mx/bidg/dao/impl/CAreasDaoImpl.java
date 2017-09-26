package mx.bidg.dao.impl;

import mx.bidg.dao.AbstractDao;
import mx.bidg.dao.CAreasDao;
import mx.bidg.dao.InterfaceDao;
import mx.bidg.model.CAreas;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CAreasDaoImpl extends AbstractDao<Integer, CAreas> implements CAreasDao {

    @Override
    public CAreas save(CAreas entity) {
        persist(entity);
        return entity;
    }

    @Override
    public CAreas update(CAreas entity) {
        modify(entity);
        return entity;
    }

    @Override
    public CAreas findById(int id) {
        return getByKey(id);
    }

    @Override
    public List<CAreas> findAll() {
        return createEntityCriteria().list();
    }

    @Override
    public boolean delete(CAreas entity) {
        remove(entity);
        return true;
    }
}
