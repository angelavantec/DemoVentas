package com.generics.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the genco_usuarios database table.
 * 
 */
@Entity
@Table(name="genco_usuarios")
public class GencoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="id_usuario")
	private int idUsuario;

	@Column(name="creado_por")
	private String creadoPor;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="fecha_creacion")
	private Date fechaCreacion;

	@Column(name="fecha_modificacion")
	private int fechaModificacion;

	@Column(name="modificado_por")
	private BigDecimal modificadoPor;

	private String nombre;

	private String password;

	private String usuario;

	public GencoUsuario() {
	}

	public int getIdUsuario() {
		return this.idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCreadoPor() {
		return this.creadoPor;
	}

	public void setCreadoPor(String creadoPor) {
		this.creadoPor = creadoPor;
	}

	public Date getFechaCreacion() {
		return this.fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getFechaModificacion() {
		return this.fechaModificacion;
	}

	public void setFechaModificacion(int fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public BigDecimal getModificadoPor() {
		return this.modificadoPor;
	}

	public void setModificadoPor(BigDecimal modificadoPor) {
		this.modificadoPor = modificadoPor;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

}