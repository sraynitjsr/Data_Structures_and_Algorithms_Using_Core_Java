package com.sraynitjsr;

import com.sraynitjsr.corejava.MyMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MySpringBootApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySpringBootApplication.class, args);

		System.out.println();
		MyMain.start();
	}
}
