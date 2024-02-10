package com.example.creationbookservice.config;

import com.example.creationbookservice.model.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.LinkedList;

@Configuration
@EnableScheduling
public class ConfigEventSource {

    @Bean("book-event-source")
    public LinkedList<Book> createBookCreationEventSource() {
        return new LinkedList<>();
    }
}
