package tn.esprit.spring;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ParentRepository extends JpaRepository<Parent, Integer> {

	
	@Query("select c from Parent c where c.nom like :nom")
	public Page<Parent> parentByNom(@Param("nom") String n, Pageable pageable);
}


