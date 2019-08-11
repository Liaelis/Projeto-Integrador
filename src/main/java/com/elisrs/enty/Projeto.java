package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the projeto database table.
 * 
 */
@Entity
@NamedQuery(name="Projeto.findAll", query="SELECT p FROM Projeto p")
public class Projeto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String nomeprojeto;

	//bi-directional many-to-one association to Plantaprojeto
	@OneToMany(mappedBy="projeto")
	private List<Plantaprojeto> plantaprojetos;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public Projeto() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeprojeto() {
		return this.nomeprojeto;
	}

	public void setNomeprojeto(String nomeprojeto) {
		this.nomeprojeto = nomeprojeto;
	}

	public List<Plantaprojeto> getPlantaprojetos() {
		return this.plantaprojetos;
	}

	public void setPlantaprojetos(List<Plantaprojeto> plantaprojetos) {
		this.plantaprojetos = plantaprojetos;
	}

	public Plantaprojeto addPlantaprojeto(Plantaprojeto plantaprojeto) {
		getPlantaprojetos().add(plantaprojeto);
		plantaprojeto.setProjeto(this);

		return plantaprojeto;
	}

	public Plantaprojeto removePlantaprojeto(Plantaprojeto plantaprojeto) {
		getPlantaprojetos().remove(plantaprojeto);
		plantaprojeto.setProjeto(null);

		return plantaprojeto;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}