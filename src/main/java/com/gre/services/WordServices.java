package com.gre.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

	public ResponseEntity<Word> search(Word word){
		try{
				ResponseEntity<Word> responseEntity = new ResponseEntity<>(wordReader.search(word),HttpStatus.OK); 
				return responseEntity;
		} catch(Exception e) {
			return new ResponseEntity<Word>(HttpStatus.NOT_FOUND);
		}
	}
	
	public Word addWord(Word word){
		wordWriter.write(word);
		return word;
	}
	
}
