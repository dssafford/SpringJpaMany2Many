package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.Place;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/25/17.
 */
public interface PlaceRepository extends JpaRepository<Place, Integer> {
}
