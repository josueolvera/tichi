package mx.bidg.service.impl;

import mx.bidg.dao.CAreasDao;
import mx.bidg.model.CAreas;
import mx.bidg.service.CAreasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CAreasServiceImpl implements CAreasService {

    @Autowired
    CAreasDao cAreasDao;

    @Override
    public CAreas save(CAreas cAreas) {
        return cAreasDao.save(cAreas);
    }

    @Override
    public CAreas update(CAreas cAreas) {
        return cAreasDao.update(cAreas);
    }

    @Override
    public CAreas findById(Integer idArea) {
        return cAreasDao.findById(idArea);
    }

    @Override
    public List<CAreas> findAll() {
        return cAreasDao.findAll();
    }

    @Override
    public boolean delete(CAreas cAreas) {
        return cAreasDao.delete(cAreas);
    }
}
