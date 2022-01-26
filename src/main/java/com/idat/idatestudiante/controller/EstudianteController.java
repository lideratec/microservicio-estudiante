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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Estudiante API")
@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
	
	@Autowired
	private EstudianteService service;
	
	@ApiOperation(value = "Listar estudiantes", notes = "Listar estudiantes")
	@ApiResponses(value = {
			@ApiResponse(code = 401, message = "No existe"),
			@ApiResponse(code = 201, message = "creado")
	})
	@GetMapping("/listar")
	public @ResponseBody List<EstudianteDTO> listarEstudiantes(){
		return service.listar();
	}
	
	@ApiOperation(value = "Crear estudiantes", notes = "Crear estudiantes")
	@PostMapping("/crear")
	public void crearEstudiante(@RequestBody EstudianteDTO dto) {
		service.crear(dto);
	}
	
	@ApiOperation(value = "Eliminar estudiantes", notes = "Eliminar estudiantes")
	@DeleteMapping("/eliminar/{id}")
	public void eliminarEstudiante(@PathVariable Integer id) {
		service.eliminar(id);
	}

}
