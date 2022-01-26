package com.idat.idatestudiante.service;

import java.util.List;

import com.idat.idatestudiante.dto.EstudianteDTO;

public interface EstudianteService {
	
	List<EstudianteDTO> listar();
	
	void crear(EstudianteDTO estudiante);
	void eliminar(Integer id);
	

}
