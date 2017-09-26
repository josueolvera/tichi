package mx.bidg.service;

import mx.bidg.model.CAreas;

import java.util.List;

public interface CAreasService {
    CAreas save(CAreas cAreas);
    CAreas update(CAreas cAreas);
    CAreas findById(Integer idArea);
    List<CAreas> findAll();
    boolean delete(CAreas cAreas);
}
