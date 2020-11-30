package com.taller.feign.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.notNullValue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.taller.feign.clientes.ProjectCliente;
import com.taller.feign.dominio.Project;

@SpringBootTest
class ClienteFeignTests {

	@Autowired
	private ProjectCliente projectCliente;
	
	@Test
	public void obtenerProjects() {
		final ResponseEntity<List<Project>> projects = projectCliente.obtenerProyectos();
		System.out.println("===================================================");
		for(Project item : projects.getBody()) {
			System.out.println("Project Id: " + item.getId());
			System.out.println("Project Identifier: " + item.getProjectIdentifier());
			System.out.println("Project name: " + item.getProjectName());
			System.out.println("Backlog Id: " + item.getBacklog().getId());
			System.out.println("Backlog Identifier: " + item.getBacklog().getProjectIdentifier());
		}
		
		assertThat(projects.getBody(), notNullValue());
	}

}
