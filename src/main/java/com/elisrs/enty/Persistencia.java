package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the persistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Persistencia.findAll", query="SELECT p FROM Persistencia p")
public class Persistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String tipopersistencia;

	//bi-directional many-to-one association to Planta
	@OneToMany(mappedBy="persistencia")
	private List<Planta> plantas;

	public Persistencia() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipopersistencia() {
		return this.tipopersistencia;
	}

	public void setTipopersistencia(String tipopersistencia) {
		this.tipopersistencia = tipopersistencia;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

	public Planta addPlanta(Planta planta) {
		getPlantas().add(planta);
		planta.setPersistencia(this);

		return planta;
	}

	public Planta removePlanta(Planta planta) {
		getPlantas().remove(planta);
		planta.setPersistencia(null);

		return planta;
	}

}