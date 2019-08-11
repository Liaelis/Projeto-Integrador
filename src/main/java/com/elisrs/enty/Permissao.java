package com.elisrs.enty;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the permissao database table.
 * 
 */
@Entity
@NamedQuery(name="Permissao.findAll", query="SELECT p FROM Permissao p")
public class Permissao implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer id;

	private Boolean tipopermissao;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="permissao")
	private List<Usuario> usuarios;

	public Permissao() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getTipopermissao() {
		return this.tipopermissao;
	}

	public void setTipopermissao(Boolean tipopermissao) {
		this.tipopermissao = tipopermissao;
	}

	public List<Usuario> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public Usuario addUsuario(Usuario usuario) {
		getUsuarios().add(usuario);
		usuario.setPermissao(this);

		return usuario;
	}

	public Usuario removeUsuario(Usuario usuario) {
		getUsuarios().remove(usuario);
		usuario.setPermissao(null);

		return usuario;
	}

}