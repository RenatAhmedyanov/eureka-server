package com.example.clientservice.controller;

import com.example.clientservice.feignClient.BookServiceConnector;
import com.example.clientservice.model.Book;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final BookServiceConnector bookServiceConnector;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookServiceConnector.getAllBooks();
    }

    @GetMapping("/test")
    public String testService() {
        log.info("client-service 2 - test");
        return "this is service 2 - test";
    }
}
