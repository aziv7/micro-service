package tn.esprit.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnseignantService implements IEnseignantService {

	@Autowired
	IEnseignantRepo enseignantRepo;
	
	@Override
	public Enseignant addOrUpdateEnseignat(Enseignant enseignant) {
		// TODO Auto-generated method stub
		return this.enseignantRepo.save(enseignant)	;
		}

	@Override
	public void deleteEnseignant(Integer id) {
		// TODO Auto-generated method stub
		this.enseignantRepo.deleteById(id);
		
	}

	@Override
	public Enseignant getEnseignantById(Integer id) {
		// TODO Auto-generated method stub
		return this.enseignantRepo.getById(id);
	}

	@Override
	public List<Enseignant> getAllEnseignant() {
		// TODO Auto-generated method stub
		return this.enseignantRepo.findAll();
	}

}
