package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.repository.BookRepository;
import com.example.service.BookService;

public class App {
    public static void main(String[] args) {
        System.out.println("Application Starting....\n");

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = context.getBean(BookService.class);

        BookRepository bookRepository = context.getBean(BookRepository.class);
    }
}
