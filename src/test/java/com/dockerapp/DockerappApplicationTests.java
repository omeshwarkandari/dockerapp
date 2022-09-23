package com.dockerapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.dockerapp.entites.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

class DockerappApplicationTests {
	
 
// Interface
// Extends JpaRepository
	
public interface PersonRepo
	    extends JpaRepository<Person, Integer> {
	    @Query(
		"SELECT CASE WHEN COUNT(s) > 0 THEN TRUE ELSE FALSE END FROM Person s WHERE s.personId = ?1")
	    Boolean
	    isPersonExitsById(Integer id);
    	   }

	@Test
	void test() {
		System.out.println("TEST WAS SUCCESSFUL");
	}
}
