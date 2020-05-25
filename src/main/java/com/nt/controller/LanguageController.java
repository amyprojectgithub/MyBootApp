package com.nt.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nt.service.ShowLanguagesService;

@Controller
public class LanguageController {
	@Autowired
	private ShowLanguagesService service;
	
	@RequestMapping("/welcome.htm")
	public String showHome() {
		return "home";
	}
	@RequestMapping("/lang.htm")
	public String getLang(Map<String,Object> map)  {
		List<String> langList=null;
		//use service
		langList=service.fetchAllLang();
		//keep result in model attribute
		map.put("langList", langList);
		//return lvn
		return "showAllLang";
	}
}
