package com.eib.marvel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.eib.marvel.models.json.MarvelCharactersInfo;
import com.eib.marvel.models.json.Results;
import com.eib.marvel.models.service.IMarvelService;


@Controller
public class MarvelController {


	@Autowired
	IMarvelService service;
	
	@RequestMapping("/")
	public String showBooks (Model model) {
		MarvelCharactersInfo marvel = service.findMarvelCharacters();
		
		List<Results> results = marvel.getData().getResults();
		model.addAttribute("titulo", marvel.getAttributionText());
		model.addAttribute("superheroes", results);

		
		return "index";
	}
}
