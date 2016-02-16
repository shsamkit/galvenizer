package com.gre.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.gre.dao.WordDao;
import com.gre.entities.Word;

@Component
public class WordReader {
	@Autowired
	WordDao wordDao;
	public Word search(Word word) throws Exception{
		try{
			word = wordDao.getWord(word.getWord());
			return word;
		}
		catch(EmptyResultDataAccessException e){
			throw new Exception(e);
		}
	}
}
