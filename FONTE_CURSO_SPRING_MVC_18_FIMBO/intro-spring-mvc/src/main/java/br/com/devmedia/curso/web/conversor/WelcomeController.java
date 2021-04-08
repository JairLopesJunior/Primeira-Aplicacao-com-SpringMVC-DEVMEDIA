package br.com.devmedia.curso.web.conversor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String returnWelcome() {
		return "welcome";
	}
	
	@RequestMapping(value = "/teste", method = RequestMethod.GET)
	public ModelAndView returnView() {
		ModelAndView view = new ModelAndView("welcome");
		view.addObject("variavel", "Sou o valor da Variavel");
		return view;
	}
}
