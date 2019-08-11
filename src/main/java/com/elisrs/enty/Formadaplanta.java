package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the formadaplanta database table.
 * 
 */
@Entity
@NamedQuery(name="Formadaplanta.findAll", query="SELECT f FROM Formadaplanta f")
public class Formadaplanta implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String formavegetal;

	//bi-directional many-to-many association to Planta
	@ManyToMany(mappedBy="formadaplantas")
	private List<Planta> plantas;

	public Formadaplanta() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFormavegetal() {
		return this.formavegetal;
	}

	public void setFormavegetal(String formavegetal) {
		this.formavegetal = formavegetal;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}