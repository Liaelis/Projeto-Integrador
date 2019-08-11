package com.elisrs.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elisrs.enty.Permissao;
import com.elisrs.enty.Usuario;
import com.elisrs.repository.PermissaoRepository;
import com.elisrs.repository.UsuarioRepository;

@Controller
public class UsuarioController {
	
	@Autowired //injetor de dependencia
	private UsuarioRepository usuarioRepository;
	@Autowired
	private PermissaoRepository permissaorepository;



	@RequestMapping(method = RequestMethod.POST, value="/cadastrar")
	public String salvar (Usuario usuario) {
		Optional<Permissao> permissao = permissaorepository.findById(2);
		if(permissao.isPresent()) {
			usuario.setPermissao(permissao.get());
		} else {
			System.out.println("nao tem");
		}
		usuarioRepository.save(usuario);
		return "pages/cadastro";
	}
	
}
