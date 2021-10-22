package com.services.groupf;

import org.springframework.data.domain.Page;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
	
	@Query("select g from Group g where g.title like :title")
	public Page<Group> GroupsByTitle(@Param("title") String title, Pageable pageable);

}
