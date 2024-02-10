package com.example.creationbookservice.controller;

import com.example.creationbookservice.service.CreationBookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@AllArgsConstructor
@RestController
@RequestMapping(("/startBooksCreation"))
public class CreationBookServiceController {
    private final CreationBookService creationBookService;

    @GetMapping
    public String startBooksCreation() {
        creationBookService.generateBooks();
        return null;
    }
}
