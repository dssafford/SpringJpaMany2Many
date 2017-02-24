package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/23/17.
 */
public interface QuizRepository extends JpaRepository<Quiz, Integer> {

}
