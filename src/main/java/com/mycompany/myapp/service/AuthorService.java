package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Service Interface for managing Author.
 */
public interface AuthorService {

    /**
     * Save a author.
     * 
     * @param author the entity to save
     * @return the persisted entity
     */
    Author save(Author author);

    /**
     *  Get all the authors.
     *  
     *  @param pageable the pagination information
     *  @return the list of entities
     */
    Page<Author> findAll(Pageable pageable);

    /**
     *  Get the "id" author.
     *  
     *  @param id the id of the entity
     *  @return the entity
     */
    Author findOne(Long id);

    /**
     *  Delete the "id" author.
     *  
     *  @param id the id of the entity
     */
    void delete(Long id);
}
