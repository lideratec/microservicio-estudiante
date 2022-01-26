package com.idat.idatestudiante.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.mapper.EstudianteRequestMapper;
import com.idat.idatestudiante.mapper.EstudianteResponseMapper;
import com.idat.idatestudiante.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepository repo;
	@Autowired
	private EstudianteRequestMapper erqm;
	@Autowired
	private EstudianteResponseMapper erpm;
	
	@Override
	public List<EstudianteDTO> listar() {
		
		return erpm.listarEstudianteDTOlist(repo.findAll());
	}

	@Override
	public void crear(EstudianteDTO estudiante) {

		repo.save(erqm.estudianteEntity(estudiante));
		
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
