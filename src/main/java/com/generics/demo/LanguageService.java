package com.generics.demo;

import java.util.ArrayList;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="languageService")
@ViewScoped
public class LanguageService {

	public List<Language> getLanguages(){
		
		List<Language> list = new ArrayList<Language>();
		Language lang = new Language();
		lang.setId(1);
		lang.setName("Angel");
		Date date = new Date();
		lang.setBirthday(new Timestamp(date.getTime()));		
		
		list.add(lang);
		
		lang = new Language();
		lang.setId(2);
		lang.setName("Generics");
		date = new Date();
		lang.setBirthday(new Timestamp(date.getTime()));		
		
		list.add(lang);
		
		return list;		
		
	}
	
}
