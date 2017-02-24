package com.javasampleapproach.springjpa.many2many.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javasampleapproach.springjpa.many2many.model.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
}
