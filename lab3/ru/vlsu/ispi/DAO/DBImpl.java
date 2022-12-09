package ru.vlsu.ispi.DAO;

import java.util.*;
import ru.vlsu.ispi.beans.*;

public class DBImpl{
	
	public Map<Long, Group> groups;
	public Map<Long, Student> students;
	private static DBImpl instance = new DBImpl();
	
	private DBImpl(){
		this.groups = new HashMap<Long, Group>();
		this.students = new HashMap<Long, Student>();
	}
	
	public static DBImpl init(){
		return instance;
	}
	
	
}