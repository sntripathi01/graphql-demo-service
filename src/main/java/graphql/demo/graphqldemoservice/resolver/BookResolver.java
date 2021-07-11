package graphql.demo.graphqldemoservice.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.model.Book;
import org.springframework.stereotype.Component;

//@Component
//This is needed when external mapping is required
public class BookResolver implements GraphQLResolver<Book> {
    public Author author(Book book) {
        return Author.builder()
                .id("1")
                .firstName("Sachchida-R")
                .lastName("Tripathi")
                .build();
    }

}