package com.idat.idatestudiante.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.entity.Estudiante;

@Mapper(componentModel = "spring")
public interface EstudianteResponseMapper {
	
	@Mappings(value = {
			@Mapping(source = "id", target = "idEstudiante"),
			@Mapping(source = "nombre", target = "nombreEstudiante"),
			@Mapping(source = "apellido", target = "apellidoEstudiante")
	})
	EstudianteDTO estudianteDTO(Estudiante estudiante);

	
	List<EstudianteDTO> listarEstudianteDTOlist(List<Estudiante> listar);
}
