package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the categoriavegetal database table.
 * 
 */
@Entity
@NamedQuery(name="Categoriavegetal.findAll", query="SELECT c FROM Categoriavegetal c")
public class Categoriavegetal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String categoria;

	//bi-directional many-to-many association to Planta
	@ManyToMany(mappedBy="categoriavegetals")
	private List<Planta> plantas;

	public Categoriavegetal() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}