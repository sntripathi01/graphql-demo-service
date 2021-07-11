package graphql.demo.graphqldemoservice.repository;

import graphql.demo.graphqldemoservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
}
