package com.gre.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Component;

import com.gre.entities.Word;
import com.gre.repository.WordRepository;

@Component
public class WordReader {
	@Autowired
	WordRepository wordRepository;
	public List<Word> search(Word word) throws Exception{
		try{
			return wordRepository.findByWord(word.getWord().trim().toLowerCase());
		}
		catch(EmptyResultDataAccessException e){
			throw new Exception(e);
		}
	}
}
