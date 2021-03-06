package org.freelo.model.tasks;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.freelo.model.users.User;

@Table(name="NOTES")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	
	@OneToOne
	private User user;
	
	@OneToOne
	private Priority priority;
	
	@ElementCollection
	private List<Component> components = new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public List<Component> getComponents() {
		return components;
	}
	public void addComponent(Component component){
		components.add(component);
	}
}
