package com.idat.idatestudiante.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(description = "Modelo DTO Estudiante")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {

	@ApiModelProperty(required = true, example = "1",name = "id",value = "ID del estudiante")
	private Integer idEstudiante;
	private String nombreEstudiante;
	private String apellidoEstudiante;

}
