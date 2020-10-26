package io.yogesh.springBootAngular.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.yogesh.springBootAngular.entity.Language;
import io.yogesh.springBootAngular.repository.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	public List<Language> getAllLanguages(){
		List<Language> languages = new ArrayList<>();
		languageRepository.findAll().forEach(languages::add);
		return languages;
	}
	
	public Language getLanguage(Integer id){
		return languageRepository.findById(id).orElse(null);
	}

	public void addLanguage(Language language) {
		languageRepository.save(language);
	}

	public void updateLanguage(Language langauge, Integer id) {
		languageRepository.save(langauge);
		
	}

	public void deleteLanguage(Integer id) {
		languageRepository.deleteById(id);
	}

}
