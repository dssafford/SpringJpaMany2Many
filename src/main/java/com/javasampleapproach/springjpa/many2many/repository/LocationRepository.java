package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/23/17.
 */
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
