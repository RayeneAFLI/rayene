package tnesprit.se1.spring1.Services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tnesprit.se1.spring1.Entities.faculte;
import tnesprit.se1.spring1.Repository.UniversitRepository;

import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class faculteService implements IfaculteService {
    UniversitRepository universitRepository;
    @Override
    public List<faculte> retrieveAllUniversits() {
        return universitRepository.findAll();
    }

    @Override
    public faculte addUniversit(faculte u) {
        return universitRepository.save(u);
    }

    @Override
    public faculte updateUniversit(faculte u) {
        return universitRepository.save(u);
    }

    @Override
    public faculte retrieveUniversit(Long idUniversit) {
        return universitRepository.findById(idUniversit).get();
    }

    @Override
    public faculte removeUniversit(Long idUniversit) {
    universitRepository.deleteById(idUniversit);
        return null;
    }
}
