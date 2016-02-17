package com.gre.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gre.entities.Word;
import com.gre.services.WordServices;

@RestController
public class ApiControllers {
	@Autowired
	WordServices wordService;
	
	@RequestMapping(value="/search")
	public ResponseEntity<List<Word>> search(Word word){
		return wordService.search(word);
	}
	
	@RequestMapping(value="/addWord",method = RequestMethod.POST)
	public ResponseEntity<String> addWord(Word word){
		System.out.println(word.toString());
		return wordService.addWord(word);
		
	}
}
