package com.it.demo.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.it.demo.model.Usuario;

@Component
public class JsonUtil {

	public Usuario lector() {
		Usuario usuario = new Usuario();
		Gson gson = new GsonBuilder().setDateFormat("dd/MM/yyyy").create();
		try {
			File initialFile = new File("src/main/resources/usuario.json");
			InputStream is = new FileInputStream(initialFile);
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is));
			usuario = gson.fromJson(bufferedReader, Usuario.class);
			bufferedReader.close();
		} catch (Exception e) {
		}
		return usuario;
	}
}