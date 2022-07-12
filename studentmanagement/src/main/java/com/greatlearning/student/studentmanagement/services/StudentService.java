package com.greatlearning.student.studentmanagement.services;

import java.util.List;

import com.greatlearning.student.studentmanagement.model.Student;


public interface StudentService {
	
	public List<Student> findAllStudents();
	public Student findById (int id);
	public Student save(Student student);
	public void deleteById (int id);

}
