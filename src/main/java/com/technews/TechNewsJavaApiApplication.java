package com.technews;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechNewsJavaApiApplication {

	public static void main(String[] args) {
		try
		{
			SpringApplication.run(TechNewsJavaApiApplication.class, args);
		}
		catch (Throwable throwable)
		{
			System.out.println(throwable.toString());
			throwable.printStackTrace();
		}
	}

}
