package graphql.demo.graphqldemoservice.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class AuthorQuery implements GraphQLQueryResolver {
    @Autowired
    private AuthorService authorService;
    public List<Author> getAllAuthor() {
        return authorService.allAuthor();
       /* return Arrays.asList(Author.builder()
                .firstName("Sachchida")
                .id("1")
                .build())
                ;*/

    }
}
