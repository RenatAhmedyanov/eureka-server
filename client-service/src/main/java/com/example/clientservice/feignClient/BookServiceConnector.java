package com.example.clientservice.feignClient;

import com.example.clientservice.model.Book;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(name = "BOOK-SERVICE", fallbackFactory = BookServiceConnector.BookServiceConnectorFallbackFactory.class)
public interface BookServiceConnector {
    @GetMapping("api/books")
    List<Book> getAllBooks();

    @Component
    class BookServiceConnectorFallbackFactory implements FallbackFactory<FallbackWithFactory> {

        @Override
        public FallbackWithFactory create(Throwable cause) {
            return new FallbackWithFactory(cause.getMessage());
        }
    }
}
