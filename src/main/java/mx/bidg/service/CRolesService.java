package mx.bidg.service;

import mx.bidg.model.CRoles;

import java.util.List;

public interface CRolesService {
    CRoles save(CRoles cRoles);
    CRoles update(CRoles cRoles);
    CRoles findById(Integer idRole);
    List<CRoles> findAll();
    boolean delete(CRoles cRoles);
}
