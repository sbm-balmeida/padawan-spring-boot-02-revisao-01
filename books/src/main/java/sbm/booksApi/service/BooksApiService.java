package sbm.booksApi.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sbm.booksApi.model.BooksApi;
import sbm.booksApi.repository.BooksApiRepository;

@Service
public class BooksApiService {
	
	@Autowired
	private BooksApiRepository bookRepository;
	
	public List<BooksApi> findAll() {
		return bookRepository.findAll();
	}
	
	public Optional<BooksApi> findById(Long id) {
        return bookRepository.findById(id);
    }
}
