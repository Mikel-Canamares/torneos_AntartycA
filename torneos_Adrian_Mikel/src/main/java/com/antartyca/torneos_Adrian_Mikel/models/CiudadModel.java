package com.antartyca.torneos_Adrian_Mikel.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="Ciudades")
public class CiudadModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_ciudad;
	
	private String nombre;
	
	@OneToMany(mappedBy = "ciudad")
	@JsonIgnoreProperties("ciudad")
	private List<DepartamentoModel> departamentos;
	
	@OneToMany(mappedBy = "ciudad")
	@JsonIgnoreProperties("ciudad")
	private List<TorneoModel> torneos;
	
	

//	GETTERS AND SETTERS
	public Integer getCod_ciudad() {
		return cod_ciudad;
	}

	public void setCod_ciudad(Integer cod_ciudad) {
		this.cod_ciudad = cod_ciudad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<DepartamentoModel> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<DepartamentoModel> departamentos) {
		this.departamentos = departamentos;
	}

	public List<TorneoModel> getTorneos() {
		return torneos;
	}

	public void setTorneos(List<TorneoModel> torneos) {
		this.torneos = torneos;
	}

	

	
	
	
	
	
}