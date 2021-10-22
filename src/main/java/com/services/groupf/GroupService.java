package com.services.groupf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupService {

	@Autowired
	private GroupRepository groupRepository;

	public Group addGroup(Group Group) {
	     return groupRepository.save(Group);
	} 

	public Group updateGroup(int id, Group newGroup) { 
	    if (groupRepository.findById(id).isPresent()) { 
	    	Group existingGroup =  groupRepository.findById(id).get();
	    	existingGroup.setTitle(newGroup.getTitle()); 
	    	existingGroup.setDescription(newGroup.getDescription()); 
	        return groupRepository.save(existingGroup); 
	}else 
	return null; 
	}

	public String deleteGroup(int id) { 
	    if (groupRepository.findById(id).isPresent()) {
	    	groupRepository.deleteById(id); 
	         return "Group deleted !"; 
	         } else 
	         return "Error while Deleting a Group !";
	} 
}
