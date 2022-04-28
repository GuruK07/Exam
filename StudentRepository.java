package com.example.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Student;

@Repository
public interface StudentRepository {
	
	@Query("select s from student s where userid=: userid ")
	//@Query("insert into student(numbers) value (?1,?2,?3,?4,?5,?6,?7)",nativeQuery=true)
	public Student getStudent(String userid);
   
}
