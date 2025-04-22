package com.bebela.demo.entities;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Project {
    @Id
    private int projectId;

    private String title;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employees;

	public Project(int projectId, String title, List<Employee> employees) {
		super();
		this.projectId = projectId;
		this.title = title;
		this.employees = employees;
	}
	
	public Project() {
    }

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

    
}
