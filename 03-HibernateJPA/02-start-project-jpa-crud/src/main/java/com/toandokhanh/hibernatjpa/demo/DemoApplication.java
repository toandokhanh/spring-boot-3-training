package com.toandokhanh.hibernatjpa.demo;

import com.toandokhanh.hibernatjpa.demo.dao.StudentDAO;
import com.toandokhanh.hibernatjpa.demo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			System.out.println("Hello Spring Boot 2024");
//			createStudent(studentDAO);
//			readStudent(studentDAO);
			queryForStudents(studentDAO);
//			queryForStudentsByLastName(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
		};
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student student = studentDAO.findById(studentId);
		if (student != null){
			studentDAO.delete(studentId);
			System.out.println("Student "+studentId+ " deleted successfully");
		} else {
			System.out.println("Student not found");
		}
	}

	private void updateStudent(StudentDAO studentDAO) {
		int studentId = 1;
		Student student = studentDAO.findById(studentId);
		if (student != null){
			System.out.println("student: "+student);
			student.setFirstName("John");
			studentDAO.update(student);
			System.out.println("Updated student: " + student);
		} else {
			System.out.println("Student not found");
		}
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findByLastname("toan");
		for (Student student: students){
			System.out.println(student);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		List<Student> students = studentDAO.findAll();
		for(Student student: students){
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {
		Student myStudent = studentDAO.findById(1);
		System.out.println("Found the student: " + myStudent);
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("tạo student tạm");
		Student tempStudent = new Student("do", "toan", "toandokhanh1209@gmail.com");
		System.out.println("đang lưu student");
		studentDAO.save(tempStudent);
		System.out.println("lưu ok");
	}
}
