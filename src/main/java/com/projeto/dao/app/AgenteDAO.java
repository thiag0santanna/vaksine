package com.projeto.dao.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.model.app.Agente;

@Repository
public interface AgenteDAO extends JpaRepository<Agente, Integer>{

}
