package com.gre.services;

import java.util.List;

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

	public ResponseEntity<List<Word>> search(Word word){
		try{
			List<Word> searchResult = wordReader.search(word);
			if(searchResult.isEmpty()){
				return new ResponseEntity<List<Word>>(HttpStatus.NO_CONTENT);	
			}
			return new ResponseEntity<>(searchResult,HttpStatus.OK); 
		} catch(Exception e) {
			e.printStackTrace();
			return new ResponseEntity<List<Word>>(HttpStatus.NOT_FOUND);
		}
	}
	
	public ResponseEntity<String> addWord(Word word){
		try{
			return new ResponseEntity<>(wordWriter.write(word).toString(),HttpStatus.OK);
		} catch(Exception e){
			e.printStackTrace();
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
}
