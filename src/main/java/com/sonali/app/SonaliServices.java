package com.sonali.app;

import java.security.Security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonaliServices {

	public static void main(String[] args) {
		String disabledAlgorithms = Security.getProperty("jdk.tls.disabledAlgorithms");
		disabledAlgorithms = disabledAlgorithms.replace("TLSv1, TLSv1.1,", "");
		Security.setProperty("jdk.tls.disabledAlgorithms", disabledAlgorithms);
		
		SpringApplication.run(SonaliServices.class, args);
	}

}