package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.LocationOld;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Doug on 2/20/17.
 */
public interface LocationOldRepository extends JpaRepository<LocationOld, Integer> {

}