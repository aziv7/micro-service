package com.services.groupf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/groups")
public class GroupRestAPI {
	@Autowired
	private GroupService groupService;
	
	 @PostMapping 
	 @ResponseStatus(HttpStatus.CREATED) 
	 public ResponseEntity<Group> createCandidat(@RequestBody Group Group) {
	      return new ResponseEntity<>(groupService.addGroup(Group), HttpStatus.OK); 
	} 
	 
	@PutMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) 
	@ResponseStatus(HttpStatus.OK) 
	public ResponseEntity<Group> updateGroup(@PathVariable(value = "id") int id, @RequestBody Group Group){ 
	    return new ResponseEntity<>(groupService.updateGroup(id, Group), HttpStatus.OK); 
	} 
	
	@DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE) 
	@ResponseStatus(HttpStatus.OK) 
	public ResponseEntity<String> deleteGroup(@PathVariable(value = "id") int id){
	     return new ResponseEntity<>(groupService.deleteGroup(id), HttpStatus.OK); 
	}
	
}
