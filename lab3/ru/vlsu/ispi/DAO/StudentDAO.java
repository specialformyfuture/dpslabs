package ru.vlsu.ispi.DAO;

import java.util.*;
import ru.vlsu.ispi.beans.*;

public class StudentDAO implements StudentDAOImpl{
	
	public void create(Student student){
		DBImpl impl = DBImpl.init();
		impl.students.put(student.getId(), student);
	}
	public void update(Student student){
		DBImpl impl = DBImpl.init();
		impl.students.put(student.getId(), student);
	}
	public void delete(long id){
		DBImpl impl = DBImpl.init();
		impl.students.remove(id);
	}
	public Student getById(long id){
		DBImpl impl = DBImpl.init();
		return impl.students.get(id);
	}
	public List<Student> getAll(){
		DBImpl impl = DBImpl.init();
		ArrayList<Student> list = new ArrayList<>(impl.students.values());
		return list;
	}
}