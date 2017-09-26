package mx.bidg.service.impl;

import mx.bidg.dao.CRolesDao;
import mx.bidg.model.CRoles;
import mx.bidg.service.CRolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CRolesServiceImpl implements CRolesService {

    @Autowired
    CRolesDao cRolesDao;

    @Override
    public CRoles save(CRoles cRoles) {
        return cRolesDao.save(cRoles);
    }

    @Override
    public CRoles update(CRoles cRoles) {
        return cRolesDao.update(cRoles);
    }

    @Override
    public CRoles findById(Integer idRole) {
        return cRolesDao.findById(idRole);
    }

    @Override
    public List<CRoles> findAll() {
        return cRolesDao.findAll();
    }

    @Override
    public boolean delete(CRoles cRoles) {
        return cRolesDao.delete(cRoles);
    }
}
