package com.projeto.controller.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.projeto.dao.app.UsuarioDAO;
import com.projeto.model.app.Usuario;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioDAO usuarioDAO;

	
	@PostMapping("/salvarUsuario")
	public String cadastrarUsuario(Usuario usuario) {

		this.usuarioDAO.save(usuario);

		return "redirect:/usuario-login";

	}

}
