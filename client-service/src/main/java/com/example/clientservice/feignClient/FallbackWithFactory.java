package com.example.clientservice.feignClient;

import com.example.clientservice.model.Book;
import lombok.extern.slf4j.Slf4j;
import java.util.Collections;
import java.util.List;

@Slf4j
record FallbackWithFactory(String reason) implements BookServiceConnector {
    @Override
    public List<Book> getAllBooks() {
        log.info("Client-Service-1 failed to send request on book service, reason {}", reason);
        return Collections.emptyList();
    }
}