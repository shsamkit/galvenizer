package com.gre.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.entities.Word;
import com.gre.services.WordServices;

@RestController
public class ApiControllers {
	@Autowired
	WordServices wordService;
	
	@RequestMapping(value="/searchWord")
	public Word search(Word word){
		wordService.addWord(word);
		return wordService.search(word);
	}
	
	@RequestMapping(value="/addWord")
	public Word addWord(Word word){
		wordService.addWord(word);
		return wordService.search(word);
	}
	
	
}
