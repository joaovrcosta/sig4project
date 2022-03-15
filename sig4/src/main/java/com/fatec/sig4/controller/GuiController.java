package com.fatec.sig4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GuiController {
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView("paginaMenu");
	}

	@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView("login");
	}

	@GetMapping("/clientes")
	public ModelAndView cadastrarCliente() {
		return new ModelAndView("cadastrarCliente");
	}

	@GetMapping("/fornecedores")
	public ModelAndView cadastrarFornecedor() {
		return new ModelAndView("cadastrarFornecedor");
	}
}
