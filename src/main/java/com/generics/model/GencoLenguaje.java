package com.generics.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the genco_lenguajes database table.
 * 
 */
@Entity
@Table(name="genco_lenguajes")
public class GencoLenguaje implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_lenguaje")
	private int idLenguaje;

	@Column(name="creado_por")
	private String creadoPor;

	@Column(name="desc_lenguaje")
	private String descLenguaje;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_modificacion")
	private Date fechaModificacion;

	@Column(name="modificado_por")
	private BigDecimal modificadoPor;

	@Column(name="nombre_lenguaje")
	private String nombreLenguaje;

	//bi-directional many-to-one association to GencoGrupo
	@ManyToOne
	@JoinColumn(name="genco_grupos_id_grupo")
	private GencoGrupo gencoGrupo;

	public GencoLenguaje() {
	}

	public int getIdLenguaje() {
		return this.idLenguaje;
	}

	public void setIdLenguaje(int idLenguaje) {
		this.idLenguaje = idLenguaje;
	}

	public String getCreadoPor() {
		return this.creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public String getDescLenguaje() {
		return this.descLenguaje;
	}

	public void setDescLenguaje(String descLenguaje) {
		this.descLenguaje = descLenguaje;
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

	public String getNombreLenguaje() {
		return this.nombreLenguaje;
	}

	public void setNombreLenguaje(String nombreLenguaje) {
		this.nombreLenguaje = nombreLenguaje;
	}

	public GencoGrupo getGencoGrupo() {
		return this.gencoGrupo;
	}

	public void setGencoGrupo(GencoGrupo gencoGrupo) {
		this.gencoGrupo = gencoGrupo;
	}

}