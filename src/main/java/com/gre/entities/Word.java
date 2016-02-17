package com.gre.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;

import lombok.Data;

@Entity
@Data
public class Word {
	
	@Id
    private String id;

    @Version
    private Integer version;
    
	private String word;
    private String meaning;
    private String example;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	public String getExample() {
		return example;
	}
	public void setExample(String example) {
		this.example = example;
	}
	@Override
	public String toString() {
		return "Word [id=" + id + ", version=" + version + ", word=" + word + ", meaning=" + meaning + ", example="
				+ example + "]";
	}
	
    
}
