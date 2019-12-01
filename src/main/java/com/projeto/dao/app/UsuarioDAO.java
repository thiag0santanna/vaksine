package com.projeto.dao.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.app.Usuario;

@Repository
public interface UsuarioDAO extends JpaRepository<Usuario,Integer> {

}
