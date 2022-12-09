package ru.vlsu.ispi.beans;

import java.util.*;

public class Student extends BaseBean{
	
	private String name;
	private Date birthdate;
	private long groupId;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	public void setBirthdate(Date birthdate){
		this.birthdate = birthdate;
	}
	
	public Date getBirthdate(){
		return birthdate;
	}
	public void setGroupId(long groupId){
		this.groupId = groupId;
	}
	
	public long getGroupId(){
		return groupId;
	}
	public String toString(){
		return getId() + " " + this.name + " " + this.birthdate;
	}
}