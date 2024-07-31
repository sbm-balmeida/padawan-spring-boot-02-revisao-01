package sbm.booksApi.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import sbm.booksApi.model.BooksApi;

public interface BooksApiRepository extends JpaRepository<BooksApi, Long> {

}
