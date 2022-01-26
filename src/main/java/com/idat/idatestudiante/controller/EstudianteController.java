package com.idat.idatestudiante.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.service.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@GetMapping("/listar")
	public @ResponseBody List<EstudianteDTO> listarEstudiantes(){
		return service.listar();
	}
	
	@PostMapping("/crear")
	public void crearEstudiante(@RequestBody EstudianteDTO dto) {
		service.crear(dto);
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminarEstudiante(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
