package com.bebela.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.bebela.demo.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
	
}
