package mx.bidg.dao.impl;

import mx.bidg.dao.AbstractDao;
import mx.bidg.dao.CRolesDao;
import mx.bidg.model.CRoles;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CRolesDaoImpl extends AbstractDao<Integer, CRoles> implements CRolesDao {

    @Override
    public CRoles save(CRoles entity) {
        persist(entity);
        return entity;
    }

    @Override
    public CRoles update(CRoles entity) {
        modify(entity);
        return entity;
    }

    @Override
    public CRoles findById(int id) {
        return getByKey(id);
    }

    @Override
    public List<CRoles> findAll() {
        return createEntityCriteria().list();
    }

    @Override
    public boolean delete(CRoles entity) {
        remove(entity);
        return true;
    }
}
