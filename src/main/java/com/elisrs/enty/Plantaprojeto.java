package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the plantaprojeto database table.
 * 
 */
@Entity
@NamedQuery(name="Plantaprojeto.findAll", query="SELECT p FROM Plantaprojeto p")
public class Plantaprojeto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private BigDecimal areaquadrada;

	@Column(name="preco_unitario")
	private BigDecimal precoUnitario;

	private Integer quantidade;

	@Column(name="sub_total")
	private BigDecimal subTotal;

	//bi-directional many-to-one association to Planta
	@ManyToOne
	@JoinColumn(name="idplanta")
	private Planta planta;

	//bi-directional many-to-one association to Plantio
	@ManyToOne
	@JoinColumn(name="idplantio")
	private Plantio plantio;

	//bi-directional many-to-one association to Projeto
	@ManyToOne
	@JoinColumn(name="idprojeto")
	private Projeto projeto;

	public Plantaprojeto() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getAreaquadrada() {
		return this.areaquadrada;
	}

	public void setAreaquadrada(BigDecimal areaquadrada) {
		this.areaquadrada = areaquadrada;
	}

	public BigDecimal getPrecoUnitario() {
		return this.precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getSubTotal() {
		return this.subTotal;
	}

	public void setSubTotal(BigDecimal subTotal) {
		this.subTotal = subTotal;
	}

	public Planta getPlanta() {
		return this.planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public Plantio getPlantio() {
		return this.plantio;
	}

	public void setPlantio(Plantio plantio) {
		this.plantio = plantio;
	}

	public Projeto getProjeto() {
		return this.projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

}