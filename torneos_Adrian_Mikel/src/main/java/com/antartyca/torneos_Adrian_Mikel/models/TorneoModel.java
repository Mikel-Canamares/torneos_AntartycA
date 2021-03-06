package com.antartyca.torneos_Adrian_Mikel.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "TORNEOS")
public class TorneoModel  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_torneo;
	
	@NotEmpty
	private  String nombre;
	
	
	private  String descripcion;
	
	
	
	@ManyToMany
	@JoinTable(name = "participan",
	joinColumns = @JoinColumn(name= "id_torneo"),
	inverseJoinColumns = @JoinColumn(name = "id_equipo"))
	private List<EquipoModel> equipos;
	
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_federacion")
	@JsonIgnoreProperties("torneos")
	private FederacionModel federacion;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "cod_ciudad")
	@JsonIgnoreProperties("torneos")
	private CiudadModel ciudad;
	
	
	public Integer getId_torneo() {
		return id_torneo;
	}
	public void setId_torneo(Integer id_torneo) {
		this.id_torneo = id_torneo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<EquipoModel> getEquipos() {
		return equipos;
	}
	public void setEquipos(List<EquipoModel> equipos) {
		this.equipos = equipos;
	}
	public FederacionModel getFederacion() {
		return federacion;
	}
	public void setFederacion(FederacionModel federacion) {
		this.federacion = federacion;
	}
	public CiudadModel getCiudad() {
		return ciudad;
	}
	public void setCiudad(CiudadModel ciudad) {
		this.ciudad = ciudad;
	}

	
	
	

}
