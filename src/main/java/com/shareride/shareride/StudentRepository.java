package com.shareride.shareride;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

	// @Query(value="SELECT p FROM Person p WHERE p.lastName=?1")
	// List<Person> getPeronInfoByLastName(String lastName);
	// @Query(value="select * from student ")
	// List<Person> getPeronInfoByLastName(String lastName);

}
