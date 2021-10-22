package miniprojet.esprit.tn;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
@RequestMapping("/enfants")
public class EnfantRESTController {
@Autowired
	private EnfantService enfantService ;
	@RequestMapping("/welcome")	
	@ResponseBody
	public String welcome(){
		return "welcome to the API";
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Enfant>createEnfant(@RequestBody Enfant enfant){
		return new ResponseEntity<>(enfantService.addEnfant(enfant),HttpStatus.OK);
	}
	
	@GetMapping
	@ResponseBody
	public java.util.List<Enfant> findAll(){
		return enfantService.getAll();
	}
	
	@PutMapping("/{id}")
	@ResponseBody
	public Enfant updateEnfant(@PathVariable int id,@RequestBody Enfant enfant ){
	return	enfantService.updateEnfant(enfant, id);
	}
	
	@DeleteMapping("/{id}")
	@ResponseBody
	public String updateEnfant(@PathVariable int id){
	return	enfantService.deleteEnfant(id);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public Enfant getById(@PathVariable int id){
	return	enfantService.getById(id);
	}
}
