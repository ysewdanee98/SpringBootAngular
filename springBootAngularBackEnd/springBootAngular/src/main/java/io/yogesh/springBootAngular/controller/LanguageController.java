package io.yogesh.springBootAngular.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.yogesh.springBootAngular.entity.Language;
import io.yogesh.springBootAngular.service.LanguageService;

@CrossOrigin("http://localhost:4200")
@RestController
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping("/hi")
	public String getHi() {
		return "Hello";
	}
	
	@RequestMapping("/languages")
	public List<Language> getAllLanguages() {
		return languageService.getAllLanguages();
	}
	
	@RequestMapping("/languages/{id}")
	public Language getLanguage(@PathVariable Integer id){
		return languageService.getLanguage(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/languages")
	public void addLanguage(@RequestBody Language language) {
		languageService.addLanguage(language);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/languages/{id}")
	public void updateLanguage(@RequestBody Language language, @PathVariable Integer id) {
		languageService.updateLanguage(language, id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/languages/{id}")
	public void deleteLanguage(@PathVariable Integer id){
		languageService.deleteLanguage(id);
	}

}
