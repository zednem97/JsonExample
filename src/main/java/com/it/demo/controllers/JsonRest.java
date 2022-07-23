package com.it.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.it.demo.model.Usuario;
import com.it.demo.utils.JsonUtil;

@RestController
@RequestMapping("/api")
public class JsonRest {
	@Autowired
	JsonUtil jsonUtil;
	
	@GetMapping("/listJSON")
	public Usuario getJson() {
		return jsonUtil.lector();
	}
}