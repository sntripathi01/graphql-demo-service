package graphql.demo.graphqldemoservice.service;

import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public List<Author> allAuthor(){
        return repository.findAll();
    }

    public Author findAuthorById(String id){
        return repository.findById(id).get();
    }

    public Author addAuthor(Author author){
        return repository.save(author);
    }

    public String deleteAuthorById(String id) {
         repository.deleteById(id);
         return "SUCCESS";
    }
}
