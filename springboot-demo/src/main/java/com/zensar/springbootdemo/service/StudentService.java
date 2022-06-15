package com.zensar.springbootdemo.service;

import java.util.List;

import com.zensar.springbootdemo.StudentDto.StudentDto;
import com.zensar.springbootdemo.entity.Student;

public interface StudentService {
	public StudentDto getStudent(int studentId);

	public List<StudentDto> getStudents();

	public StudentDto insertStudent(StudentDto studentdto);

	public void deleteStudent(int studentId);

	public StudentDto updateStudent(int studentId, StudentDto studentDto);
}
