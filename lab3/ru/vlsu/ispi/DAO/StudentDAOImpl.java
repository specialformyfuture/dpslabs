package ru.vlsu.ispi.DAO;

import java.util.*;
import ru.vlsu.ispi.beans.*;

public interface StudentDAOImpl{
	public void create(Student student);
	public void update(Student student);
	public void delete(long id);
	public Student getById(long id);
	public List<Student> getAll();
}