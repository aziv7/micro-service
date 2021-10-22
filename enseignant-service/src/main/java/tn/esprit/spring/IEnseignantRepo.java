package tn.esprit.spring;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEnseignantRepo extends JpaRepository<Enseignant, Integer> {

}
