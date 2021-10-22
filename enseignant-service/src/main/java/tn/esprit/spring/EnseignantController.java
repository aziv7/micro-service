package tn.esprit.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnseignantController {

	@Autowired
	IEnseignantService enseignantService;
	
	private String title = "Hello candidate service";
	@RequestMapping("/hello")
	public String  sayHello(){
		System.out.println(title);
		return title;
	}
	
	@PostMapping("/add")
	@ResponseBody
	public ResponseEntity<Enseignant> addOrUpdateEnseignant(@RequestBody Enseignant e){
		return new ResponseEntity<>(this.enseignantService.addOrUpdateEnseignat(e), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Enseignant> getEnseignantById(@RequestParam("id") Integer id){
		return new ResponseEntity<>(this.enseignantService.getEnseignantById(id),HttpStatus.OK);
	}
	@GetMapping()
	@ResponseBody
	public ResponseEntity<List<Enseignant>> getEnseignantById(){
		return new ResponseEntity<>(this.enseignantService.getAllEnseignant(),HttpStatus.OK);
	}
	@DeleteMapping
	@ResponseBody
	public ResponseEntity<String> deleteEnseignant(@RequestParam("id") Integer id){
		this.enseignantService.deleteEnseignant(id);
		return new ResponseEntity<>("deleted", HttpStatus.OK);
	}
	
}
