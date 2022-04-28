package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.bind.Name;

@Entity
@Table(name="student")
public class Student<JSON> {
	
	@Column
	public boolean status;
	
	@Id
	public String userid;
	
	@Column
	public String  roll_no;
	
	@Column
	public JSON numbers;
	
	@Column(name="alphabets")
	public JSON alphabets;
}
