package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the plantio database table.
 * 
 */
@Entity
@NamedQuery(name="Plantio.findAll", query="SELECT p FROM Plantio p")
public class Plantio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String tipoplantio;

	//bi-directional many-to-one association to Plantaprojeto
	@OneToMany(mappedBy="plantio")
	private List<Plantaprojeto> plantaprojetos;

	public Plantio() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoplantio() {
		return this.tipoplantio;
	}

	public void setTipoplantio(String tipoplantio) {
		this.tipoplantio = tipoplantio;
	}

	public List<Plantaprojeto> getPlantaprojetos() {
		return this.plantaprojetos;
	}

	public void setPlantaprojetos(List<Plantaprojeto> plantaprojetos) {
		this.plantaprojetos = plantaprojetos;
	}

	public Plantaprojeto addPlantaprojeto(Plantaprojeto plantaprojeto) {
		getPlantaprojetos().add(plantaprojeto);
		plantaprojeto.setPlantio(this);

		return plantaprojeto;
	}

	public Plantaprojeto removePlantaprojeto(Plantaprojeto plantaprojeto) {
		getPlantaprojetos().remove(plantaprojeto);
		plantaprojeto.setPlantio(null);

		return plantaprojeto;
	}

}