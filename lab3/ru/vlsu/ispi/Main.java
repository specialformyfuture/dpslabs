package ru.vlsu.ispi;

import ru.vlsu.ispi.DAO.*;
import ru.vlsu.ispi.beans.*;
import java.util.*;

public class Main{


	public static void main(String[] args){

		StudentDAOjdbc studentDAO = new StudentDAOjdbc();
		
		Student student = new Student();
		student.setName("Evgen");
		student.setBirthdate(new Date());
		student.setId(1L);
		
		studentDAO.create(student);
		
		student = new Student();
		student.setName("Evgen2");
		student.setBirthdate(new Date());
		student.setId(2L);
		
		studentDAO.create(student);

		student = new Student();
		student.setName("Evgen3");
		student.setBirthdate(new Date());
		student.setId(3L);

		studentDAO.create(student);

		System.out.println(studentDAO.getById(2));

		List<Student> students = studentDAO.getAll();

		for(Student st: students){
			System.out.println(st.toString());
		}

		studentDAO.delete(1);

		students = studentDAO.getAll();

		for(Student st: students){
			System.out.println(st.toString());
		}
	}
}