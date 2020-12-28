package com.scratch.scratch1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class Scratch1Application {

	public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(args[0]);
        } else {
			System.out.println("Hello World!");
		}
	}
}
