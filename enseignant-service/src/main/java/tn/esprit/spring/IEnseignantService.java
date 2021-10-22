package tn.esprit.spring;

import java.util.List;

public interface IEnseignantService {
 Enseignant addOrUpdateEnseignat(Enseignant enseignant);
 void deleteEnseignant(Integer id);
 Enseignant getEnseignantById(Integer id);
 List<Enseignant> getAllEnseignant();
 
}
