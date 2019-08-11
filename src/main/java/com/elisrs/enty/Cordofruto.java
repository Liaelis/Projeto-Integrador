package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the cordofruto database table.
 * 
 */
@Entity
@NamedQuery(name="Cordofruto.findAll", query="SELECT c FROM Cordofruto c")
public class Cordofruto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String cor;

	//bi-directional many-to-many association to Planta
	@ManyToMany(mappedBy="cordofrutos")
	private List<Planta> plantas;

	public Cordofruto() {
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