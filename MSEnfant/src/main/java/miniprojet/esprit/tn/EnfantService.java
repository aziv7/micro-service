package miniprojet.esprit.tn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class EnfantService {
@Autowired
	private EnfantRepository enfantDAO;


public Enfant addEnfant(Enfant enfant){
return	enfantDAO.save(enfant);
}
	
public List<Enfant> getAll(){
	return enfantDAO.findAll();
}


public Enfant updateEnfant(Enfant enfant,int id){
	if(enfantDAO.findById(id).isPresent()){
		Enfant found=enfantDAO.getById(id);
		found.setAge(enfant.getAge());
		found.setNom(enfant.getNom());
		found.setPrenom(enfant.getPrenom());
		return enfantDAO.save(found);
	}
	return null;
}

public String deleteEnfant(int id){
	if(enfantDAO.findById(id).isPresent()){
		enfantDAO.deleteById(id);
		return "Enfant supprimé";
	}
	return "Enfant introuvable";
}


public Enfant getById(int id){
	if(enfantDAO.findById(id).isPresent()){
		return enfantDAO.getById(id);
	}
	return null;
}


}
