package com.javasampleapproach.springjpa.many2many.repository;

import com.javasampleapproach.springjpa.many2many.model.PlaceTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Doug on 2/25/17.
 */
@Repository
public interface PlaceTestRepository extends JpaRepository<PlaceTest, Integer> {

//	public final static String FIND_BY_ADDRESS_QUERY = "SELECT p " +
//			  "FROM Person p LEFT JOIN p.addresses a " +
//			  "WHERE a.address = :address";

//	public final static String FIND_BY_TEST_QUERY = "SELECT p " +
//			  "FROM PlaceTest p LEFT JOIN p.testId t " +
//			  "WHERE p.test_id = :id";
//
//
//	@Query(value = "Select * "
//			  + "FROM rule_master TRM ,T_SYSTEM_CONFIG TSC  Where"
//			  + " Tsc.Parameter_Name='APPLICABLE_RULE_TYPE' "
//			  + " And Tsc.Parameter_KEY= :systemType"
//			  + " AND Tsc.Parameter_Value=trm.rule_type  "
//			  + " And Rule_Status='ON'"
//			  + " Order By Rule_Priority", nativeQuery = true)
//	public List<RuleMaster> findByRuleStatus(@Param("systemType" String systemType);
//



	@Query(value = "Select * "
		+ "FROM PLACE_TEST pt, TEST t WHERE "
		+ " pt.TEST_ID = t.ID "
		+ " AND t.ID = :id", nativeQuery = true)
	public List<PlaceTest> findByTest(@Param("id") Integer testId);
}
