package com.example.spring_mjm.repositories;

import com.example.spring_mjm.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository <Author,Long> {

}
