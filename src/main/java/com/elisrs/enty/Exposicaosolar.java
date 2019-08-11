package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the exposicaosolar database table.
 * 
 */
@Entity
@NamedQuery(name="Exposicaosolar.findAll", query="SELECT e FROM Exposicaosolar e")
public class Exposicaosolar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private String tipoexposicao;

	//bi-directional many-to-many association to Planta
	@ManyToMany(mappedBy="exposicaosolars")
	private List<Planta> plantas;

	public Exposicaosolar() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoexposicao() {
		return this.tipoexposicao;
	}

	public void setTipoexposicao(String tipoexposicao) {
		this.tipoexposicao = tipoexposicao;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

}