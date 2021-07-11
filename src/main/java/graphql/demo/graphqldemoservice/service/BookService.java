package graphql.demo.graphqldemoservice.service;

import graphql.demo.graphqldemoservice.model.Book;
import graphql.demo.graphqldemoservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public List<Book> allBook(){
        return repository.findAll();
    }

    public Book findBookById(String id){
        return repository.findById(id).get();
    }

    public Book addBook(Book book){
        return repository.save(book);
    }

    public String deleteBookById(String id) {
        repository.deleteById(id);
        return "SUCCESS";
    }
}
