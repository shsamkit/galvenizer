package com.gre.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gre.entities.Word;
import com.gre.repository.WordRepository;

@Component
public class WordWriter {
	@Autowired
	WordRepository wordRepository;
	
	public Word write(Word word) throws Exception{
		if(word.getWord() == null || word.getMeaning() == null){
			throw new Exception();
		}
		if(word.getWord().isEmpty() || word.getMeaning().isEmpty()){
			throw new Exception();
		}
		word.setWord(word.getWord().toLowerCase());
		word.setMeaning(word.getMeaning().toLowerCase());
		wordRepository.save(word);
		return word;
	}
}
