package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cordafolha database table.
 * 
 */
@Entity
@NamedQuery(name="Cordafolha.findAll", query="SELECT c FROM Cordafolha c")
public class Cordafolha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String cor;

	//bi-directional many-to-many association to Planta
	@ManyToMany(mappedBy="cordafolhas")
	private List<Planta> plantas;

	public Cordafolha() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}