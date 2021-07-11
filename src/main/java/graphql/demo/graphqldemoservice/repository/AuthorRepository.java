package graphql.demo.graphqldemoservice.repository;

import graphql.demo.graphqldemoservice.model.Author;
import graphql.demo.graphqldemoservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, String> {
}
