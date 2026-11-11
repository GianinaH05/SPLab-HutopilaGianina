package ro.uvt.presistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.uvt.clase.Author;

@Repository
public interface AuthorsRepository extends JpaRepository<Author, Long> {

}
