package tnesprit.se1.spring1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tnesprit.se1.spring1.Entities.faculte;

public interface UniversitRepository extends JpaRepository<faculte,Long> {
}
