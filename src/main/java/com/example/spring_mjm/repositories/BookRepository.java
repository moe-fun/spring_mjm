package com.example.spring_mjm.repositories;

import com.example.spring_mjm.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository <Book,Long> {

}
