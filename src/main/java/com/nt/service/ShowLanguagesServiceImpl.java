package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.stereotype.Service;
@Service
public class ShowLanguagesServiceImpl implements ShowLanguagesService {

	@Override
	public List<String> fetchAllLang() {
		Locale locales[]=null;
		List<String> langList=null;
		//get all available locales
		locales=Locale.getAvailableLocales();
		//craete List to hold all the lang
		langList=new ArrayList<String>();
		//get all languages
		for(Locale locale:locales) {
			langList.add(locale.getDisplayLanguage());
		}
		return langList;
	}

}
