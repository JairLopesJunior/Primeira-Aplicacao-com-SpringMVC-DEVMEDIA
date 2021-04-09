package br.com.devmedia.curso.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.devmedia.curso.dao.UsuarioDao;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuarioDao usuarioDao;
	
	@RequestMapping(value = "/todos", method = RequestMethod.GET)
	public ModelAndView listarTodos(ModelMap model) {
		model.addAttribute("usuarios", usuarioDao.getTodos());
		return new ModelAndView("/user/list", model);
	}
}
