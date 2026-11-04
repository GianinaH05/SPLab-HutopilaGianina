package ro.uvt.presistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.clase.Book;

@Repository
public interface BooksRepository extends JpaRepository<Book, Integer> {
}
