package com.apress.springbootrecipes_library;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryApplication.class, args);
	}

	@Bean
	public ApplicationRunner booksInitializer(BookService bookService) {
		return args -> {
			bookService.create(new Book("1234", "Hello", "Jenna Pang"));
			bookService.create(new Book("1010", "Spring", "Ju Young Pang"));
			bookService.create(new Book("2310", "Spring Boot Recipe", "Marten Denium"));
		};
	}

}
