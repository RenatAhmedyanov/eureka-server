package com.example.bookservice.controller;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Slf4j
@AllArgsConstructor
@RestController()
@RequestMapping("/api/books")
public class BookController {
    private final BookService bookService;

    @GetMapping()
    public List<Book> getAllBooks() {
       return bookService.getAllBooks();
    }

    @GetMapping("/test")
    public String testBookService() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        log.info("testing logging");
        return "this is book-service test " + request.getHeader("test");
    }



}
