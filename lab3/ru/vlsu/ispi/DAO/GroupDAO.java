package ru.vlsu.ispi.DAO;

import ru.vlsu.ispi.beans.*;
import java.util.*;
public class GroupDAO {
	
	private DBImpl impl = DBImpl.init();
	public void create(Group group){
		impl.groups.put(group.getId(), group);
	}
	public void update(Group group){
		impl.groups.put(group.getId(), group);
	}
	public void delete(long id){
		impl.groups.remove(id);
	}
	public Group getById(long id){
		return impl.groups.get(id);
	}
	public List<Group> getAll(){
		ArrayList<Group> list = new ArrayList<>(impl.groups.values());
		return list;
	}
}