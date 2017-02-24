package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/19/17.
 */
public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{
}
