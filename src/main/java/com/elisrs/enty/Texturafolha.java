package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the texturafolha database table.
 * 
 */
@Entity
@NamedQuery(name="Texturafolha.findAll", query="SELECT t FROM Texturafolha t")
public class Texturafolha implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String tipotextura;

	//bi-directional many-to-many association to Planta
	@ManyToMany
	@JoinTable(
		name="plantatexturafolha"
		, joinColumns={
			@JoinColumn(name="idtexturafolha")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idplanta")
			}
		)
	private List<Planta> plantas;

	public Texturafolha() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipotextura() {
		return this.tipotextura;
	}

	public void setTipotextura(String tipotextura) {
		this.tipotextura = tipotextura;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}