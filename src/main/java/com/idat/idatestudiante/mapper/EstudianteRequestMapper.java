package com.idat.idatestudiante.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.idat.idatestudiante.dto.EstudianteDTO;
import com.idat.idatestudiante.entity.Estudiante;

@Mapper(componentModel = "spring")
public interface EstudianteRequestMapper {

	@Mappings(value = {
			@Mapping(source = "idEstudiante", target = "id"),
			@Mapping(source = "nombreEstudiante", target = "nombre"),
			@Mapping(source = "apellidoEstudiante", target = "apellido")
	})
	Estudiante estudianteEntity(EstudianteDTO estudiante);

		
}
