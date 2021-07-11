package graphql.demo.graphqldemoservice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.demo.graphqldemoservice.model.Book;
import graphql.demo.graphqldemoservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookQuery implements GraphQLQueryResolver {
    @Autowired
    private BookService bookService;

    public List<Book> allBook() {
        return bookService.allBook();
    }

    public Book bookById(String id) {
        return bookService.findBookById(id);
    }
}
