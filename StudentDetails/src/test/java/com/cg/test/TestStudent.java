package com.cg.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.cg.model.Student;

public class TestStudent {
	@Test
	void testStudentDetails() {
	        Student student = new Student();
	        student.setName("Sravani");
	        student.setAge(23);
	        student.setSalary(28000);
	 
	        assertEquals("Sravani", student.getName());
	        assertEquals(23, student.getAge());
	        assertEquals(28000.0, student.getSalary(), 0.001);
	    }
	}



