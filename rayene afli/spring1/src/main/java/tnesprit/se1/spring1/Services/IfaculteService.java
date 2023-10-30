package tnesprit.se1.spring1.Services;

import tnesprit.se1.spring1.Entities.faculte;

import java.util.List;

public interface IfaculteService {
    List<faculte> retrieveAllUniversits();

    faculte addUniversit(faculte u);

    faculte updateUniversit(faculte u);

    faculte retrieveUniversit(Long idUniversit);

    faculte removeUniversit(Long idUniversit);

}
