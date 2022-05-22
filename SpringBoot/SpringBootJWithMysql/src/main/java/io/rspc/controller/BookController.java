package io.rspc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.rspc.model.Book;
import io.rspc.repository.BookRepository;

@RestController
public class BookController 
{
	@Autowired
	BookRepository bookRepository;
	
	@PostMapping("/insertbook")
	public String insertBook(@RequestBody Book book)
	{
		bookRepository.save(book);
		return "Record inserted successfully!!";
	}
	
	@PostMapping("/insertMulbook")
	public String insertBook(@RequestBody List<Book> book)
	{
		bookRepository.saveAll(book);
		return "All records inserted successfully!!";
	}
	
	@GetMapping("/getAllBooks")
	public List<Book> getBooks()
	{
		return (List<Book>)bookRepository.findAll();
	}
	
	@GetMapping("/getByBookName/{name}")
	public List<Book> getBooksByName(@PathVariable("name") String bookName)
	{
		return (List<Book>)bookRepository.findBybookName(bookName);
	}
	
	@GetMapping("/getByBookId/{id}")
	public Optional<Book> getBooksById(@PathVariable("id") int id)
	{
		return bookRepository.findById(id);
	}
	
	@DeleteMapping("/deleteByBookId/{id}")
	public String deleteBook(@PathVariable("id") int id)
	{
		bookRepository.deleteById(id);
		return "Record deleted successfully!!";
	}
	
	@PutMapping("/updateByBookId")
	public Book UpdateBook(@RequestBody Book book)
	{
		Book bobj=bookRepository.findById(book.getBookId()).orElse(null);
		bobj.setBookName(book.getBookName());
		bobj.setBookAuthor(book.getBookAuthor());
		return bookRepository.save(bobj);
	}
}
