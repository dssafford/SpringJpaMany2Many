package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/24/17.
 */
public interface ScoreRepository extends JpaRepository<Score, Integer> {
}
