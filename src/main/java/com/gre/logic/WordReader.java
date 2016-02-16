package com.gre.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gre.dao.WordDao;
import com.gre.entities.Word;

@Component
public class WordReader {
	@Autowired
	WordDao wordDao;
	public Word search(Word word){
		//word = wordDao.getWord(word.getWord());
		word.setMeaning("to sap energy from");
		return word;
	}
}
