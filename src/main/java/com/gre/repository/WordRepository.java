package com.gre.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.gre.entities.Word;

public interface WordRepository extends MongoRepository<Word, String> {
	List<Word> findByWord(@Param("word") String word);
}
