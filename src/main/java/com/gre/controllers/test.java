package com.gre.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gre.entities.Word;
import com.gre.repository.WordRepository;
import com.gre.services.WordServices;

@RestController
public class test {
	@Autowired
	WordServices wordService;
	
	@Autowired
	private WordRepository wordRepository;
	
	
	@RequestMapping(value="/testAdd")
	public String testAdd(){
		Word word = new Word();
		word.setWord("galvenize");
		wordRepository.save(word);
		return "Okay";
	}	
	
	@RequestMapping(value="/testSearch")
	public List<Word> testSearch(Word word){
		return wordRepository.findByWord(word.getWord());
	}	
}
