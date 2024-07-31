package sbm.booksApi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sbm.booksApi.model.BooksApi;
import sbm.booksApi.service.BooksApiService;



@RestController
@RequestMapping("/api/books")
public class BooksApiController {

	@Autowired
	private BooksApiService booksApiService;
	
	@GetMapping
	public List<BooksApi> getAllBooks() {
		return booksApiService.findAll();
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<BooksApi> getBooksById(@PathVariable Long id) {
        Optional<BooksApi> book = booksApiService.findById(id);
        return book.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
