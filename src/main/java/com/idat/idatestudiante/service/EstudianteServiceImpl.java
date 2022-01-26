package com.idat.idatestudiante.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.entity.Estudiante;
import com.idat.idatestudiante.repository.EstudianteRepository;

@Service
public class EstudianteServiceImpl implements EstudianteService {

	@Autowired
	private EstudianteRepository repo;
	
	@Override
	public List<EstudianteDTO> listar() {
		
		EstudianteDTO dto = null;
		
		List<EstudianteDTO> listDTO = new ArrayList<>();
		
		List<Estudiante> estudiante = repo.findAll();
		
		for (Estudiante e : estudiante) {
			dto =new EstudianteDTO();
			dto.setId(e.getId());
			dto.setNombre(e.getNombre());
			dto.setApellido(e.getApellido());
			listDTO.add(dto);
		}
		return listDTO;
	}

	@Override
	public void crear(EstudianteDTO estudiante) {
		Estudiante entity = new Estudiante();
		entity.setNombre(estudiante.getNombre());
		entity.setApellido(estudiante.getApellido());
		
		repo.save(entity);
		
	}

	@Override
	public void eliminar(Integer id) {
		repo.deleteById(id);
	}

}
