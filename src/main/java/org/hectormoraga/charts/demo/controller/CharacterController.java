package org.hectormoraga.charts.demo.controller;

import java.util.List;

import org.hectormoraga.charts.demo.entity.DndCharacter;
import org.hectormoraga.charts.demo.service.DndCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/dnd")
public class CharacterController {
	@Autowired
	private DndCharacterService dndCharacterService;
	
	@GetMapping("/")
	public ModelAndView loadAllCharacters() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<DndCharacter> listChars = dndCharacterService.gerAllCharacters();
		modelAndView.addObject("allChars", listChars);
		
		return modelAndView;
	}
	
	@GetMapping("/characters/{id}")
	public ModelAndView getCharacterById(@PathVariable int id) {
		ModelAndView modelAndView = new ModelAndView("index");

		List<DndCharacter> listChars = dndCharacterService.gerAllCharacters();
		modelAndView.addObject("allChars", listChars);
		DndCharacter dndCharacter = dndCharacterService.getCharacterById(id);
		modelAndView.addObject("dnd_character", dndCharacter);
		
		return modelAndView;
	}

	@GetMapping("/characters")
	public String getAllCharacters(Model theModel) {
		List<DndCharacter> listChars = dndCharacterService.gerAllCharacters();
		theModel.addAttribute("allChars", listChars);
		
		return "index";
	}

}
