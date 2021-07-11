package graphql.demo.graphqldemoservice.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.model.AuthorInput;
import graphql.demo.graphqldemoservice.service.AuthorService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

    @Resource
    private AuthorService authorService;

    public Author addAuthor(AuthorInput authorInput) {
        Author author = Author.builder()
                .id(authorInput.getId())
                .firstName(authorInput.getFirstName())
                .lastName(authorInput.getLastName())
                .build();
        System.out.printf("author = "+author);
        return authorService.addAuthor(author);
    }

    public String deleteAuthorById(String id){
        return authorService.deleteAuthorById(id);
    }

}