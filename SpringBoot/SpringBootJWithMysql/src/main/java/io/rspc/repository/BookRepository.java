package io.rspc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.rspc.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> 
{
	public List<Book> findBybookName(String name);
}
