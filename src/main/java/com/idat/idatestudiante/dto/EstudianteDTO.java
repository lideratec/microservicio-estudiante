package com.idat.idatestudiante.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EstudianteDTO {

	private Integer id;
	private String nombre;
	private String apellido;

}
