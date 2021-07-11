package graphql.demo.graphqldemoservice.service;

import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.model.Book;
import graphql.demo.graphqldemoservice.repository.AuthorRepository;
import graphql.demo.graphqldemoservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

@Component
public class DataLoader {
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private AuthorRepository authorRepository;

    @PostConstruct
    public void loadData(){
        Author author1 = authorRepository.save( Author.builder()
                .firstName("Sachchida")
                .lastName("Tripathi")
                .build());

        Author author2 = authorRepository.save( Author.builder()
                .firstName("Neha")
                .lastName("Misra")
                .build());
        List<Book> bookList = Arrays.asList(
                Book.builder()
                        .name("Java Book")
                        .pageCount(100)
                        .author(author1)
                        .build(),
                Book.builder()
                        .name("HTML Book")
                        .pageCount(100)
                        .author(author2)
                        .build()
        );
        bookRepository.saveAll(bookList);
    }
}
