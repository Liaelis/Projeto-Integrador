package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the foto database table.
 * 
 */
@Entity
@NamedQuery(name="Foto.findAll", query="SELECT f FROM Foto f")
public class Foto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private byte[] imagemplanta;

	//bi-directional many-to-one association to Planta
	@OneToMany(mappedBy="foto")
	private List<Planta> plantas;

	public Foto() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImagemplanta() {
		return this.imagemplanta;
	}

	public void setImagemplanta(byte[] imagemplanta) {
		this.imagemplanta = imagemplanta;
	}

	public List<Planta> getPlantas() {
		return this.plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

	public Planta addPlanta(Planta planta) {
		getPlantas().add(planta);
		planta.setFoto(this);

		return planta;
	}

	public Planta removePlanta(Planta planta) {
		getPlantas().remove(planta);
		planta.setFoto(null);

		return planta;
	}

}