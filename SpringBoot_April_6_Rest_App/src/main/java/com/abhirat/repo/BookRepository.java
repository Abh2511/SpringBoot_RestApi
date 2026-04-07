package com.abhirat.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.abhirat.entity.Book;

@RepositoryRestResource(path = "books")
public interface BookRepository extends JpaRepository<Book,Integer>
{
	
}
