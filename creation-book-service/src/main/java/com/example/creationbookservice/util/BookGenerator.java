package com.example.creationbookservice.util;

import com.example.creationbookservice.model.Book;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Random;

@Component
public class BookGenerator {
    private final Random random = new Random();

    public Book createNewBook() {
        int randomBookId = random.nextInt(1000);
        String randomName = "Book name: " + randomBookId;
        String randomDescription = "Book description: " + randomBookId;
        String status = "unchecked";
        int randomPrice = randomBookId;

        return Book.builder()
                .id(randomBookId)
                .name(randomName)
                .description(randomDescription)
                .status(status)
                .price(BigDecimal.valueOf(randomPrice)).build();
    }
}
