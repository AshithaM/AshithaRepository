package com.spring.example;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectApplication.class, args);
		
			System.out.println("hii");
			openHomePage();
			
		}
	
	 private static void openHomePage() { 
		 System.out.println("opening window");
		 String url="http://localhost:8081/student"; 
		 if(Desktop.isDesktopSupported()) {
			 Desktop desktop=Desktop.getDesktop(); 
			 try { 
				 desktop.browse(new URI(url));
	 
			 }catch(IOException | URISyntaxException e) {
				 e.printStackTrace();
	  
			 } 
		}else { 
			Runtime runtime=Runtime.getRuntime();
			try {
	  runtime.exec("rundll32 url.dll,FileProtocolHandler " +url);
	  
	  }catch(IOException e) {
		  e.printStackTrace();
	  
	  } } }
	  
	 
	}


