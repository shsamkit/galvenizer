package com.gre.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gre.dao.WordDao;
import com.gre.entities.Word;

@Component
public class WordWriter {
	@Autowired
	WordDao wordDao;
	public Word write(Word word){
		wordDao.addWord(word);
		return word;
	}
}
