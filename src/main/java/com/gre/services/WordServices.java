package com.gre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gre.entities.Word;
import com.gre.logic.WordReader;
import com.gre.logic.WordWriter;

@Service
public class WordServices {
	
	@Autowired
	private WordReader wordReader;
	
	@Autowired
	private WordWriter wordWriter;

	public Word search(Word word){
		return wordReader.search(word);
	}
	
	public Word addWord(Word word){
		wordWriter.write(word);
		return word;
	}
	
}
