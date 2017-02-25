package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/25/17.
 */
public interface TestRepository extends JpaRepository<Test, Integer> {




}
