package com.generics.demo;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;


@ManagedBean(name="dtTableView")
@ViewScoped
public class BasicView {

	private List<Language> languages;

	@ManagedProperty("#{languageService}")
	private LanguageService service;
	
	@PostConstruct
	public void init(){
		languages = service.getLanguages();
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setService(LanguageService service) {
		this.service = service;
	}	
	
}
