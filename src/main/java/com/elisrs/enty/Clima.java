package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clima database table.
 * 
 */
@Entity
@NamedQuery(name="Clima.findAll", query="SELECT c FROM Clima c")
public class Clima implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String tipoclima;

	//bi-directional many-to-many association to Planta
	@ManyToMany(mappedBy="climas")
	private List<Planta> plantas;

	public Clima() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoclima() {
		return this.tipoclima;
	}

	public void setTipoclima(String tipoclima) {
		this.tipoclima = tipoclima;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}