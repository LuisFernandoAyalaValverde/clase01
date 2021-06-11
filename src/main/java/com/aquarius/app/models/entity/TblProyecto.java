package com.aquarius.app.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PROYECTO")
public class TblProyecto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "estado")
	private Long estado;
	
	@Column(name = "tipo")
	private Long tipo;
	
	@Column(name = "fech_vencimiento")
	private String fechvencimiento;
	
	@Column(name = "flag_estado")
	private String flagestado;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getEstado() {
		return estado;
	}

	public void setEstado(Long estado) {
		this.estado = estado;
	}

	public Long getTipo() {
		return tipo;
	}

	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}

	public String getFechvencimiento() {
		return fechvencimiento;
	}

	public void setFechvencimiento(String fechvencimiento) {
		this.fechvencimiento = fechvencimiento;
	}

	public String getFlagestado() {
		return flagestado;
	}

	public void setFlagestado(String flagestado) {
		this.flagestado = flagestado;
	}

	
	
}
