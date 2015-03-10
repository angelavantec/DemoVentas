package com.generics.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the genco_grupos database table.
 * 
 */
@Entity
@Table(name="genco_grupos")
public class GencoGrupo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_grupo")
	private int idGrupo;

	@Column(name="creado_por")
	private String creadoPor;

	@Column(name="desc_grupo")
	private String descGrupo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;

	@Column(name="modificado_por")
	private BigDecimal modificadoPor;

	@Column(name="nombre_grupo")
	private String nombreGrupo;

	//bi-directional many-to-one association to GencoLenguaje
	@OneToMany(mappedBy="gencoGrupo")
	private List<GencoLenguaje> gencoLenguajes;

	public GencoGrupo() {
	}

	public int getIdGrupo() {
		return this.idGrupo;
	}

	public void setIdGrupo(int idGrupo) {
		this.idGrupo = idGrupo;
	}

	public String getCreadoPor() {
		return this.creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public String getDescGrupo() {
		return this.descGrupo;
	}

	public void setDescGrupo(String descGrupo) {
		this.descGrupo = descGrupo;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public BigDecimal getModificadoPor() {
		return this.modificadoPor;
	}

	public void setModificadoPor(BigDecimal modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public String getNombreGrupo() {
		return this.nombreGrupo;
	}

	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}

	public List<GencoLenguaje> getGencoLenguajes() {
		return this.gencoLenguajes;
	}

	public void setGencoLenguajes(List<GencoLenguaje> gencoLenguajes) {
		this.gencoLenguajes = gencoLenguajes;
	}

}