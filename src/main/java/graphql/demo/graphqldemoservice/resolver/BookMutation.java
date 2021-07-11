package graphql.demo.graphqldemoservice.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.model.AuthorInput;
import graphql.demo.graphqldemoservice.model.Book;
import graphql.demo.graphqldemoservice.service.AuthorService;
import graphql.demo.graphqldemoservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BookMutation implements GraphQLMutationResolver {

    @Resource
    private BookService bookService;
    @Autowired
    private AuthorService authorService;

    public Book addBook(String name, int pageCount, String authorId) {
        Author author = authorService.findAuthorById(authorId);
        Book book = Book.builder()
                .name(name)
                .pageCount(pageCount)
                .author(author)
                .build();
        System.out.printf("Book = "+book);
        return bookService.addBook(book);
    }
    public String deleteBookById(String id){
        return bookService.deleteBookById(id);
    }
}