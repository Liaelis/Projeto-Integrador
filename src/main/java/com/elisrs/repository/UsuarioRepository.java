package com.elisrs.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.elisrs.enty.Usuario;

@Repository
@Transactional
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
