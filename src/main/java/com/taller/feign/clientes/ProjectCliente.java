package com.taller.feign.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.taller.feign.dominio.Project;

@FeignClient(name="projects", url="localhost:9090")
public interface ProjectCliente {
	
	@GetMapping("/project")
	ResponseEntity<List<Project>> obtenerProyectos();
	
}
