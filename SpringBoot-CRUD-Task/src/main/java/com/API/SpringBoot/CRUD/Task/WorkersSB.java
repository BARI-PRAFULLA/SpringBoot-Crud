package com.API.SpringBoot.CRUD.Task;

public class WorkersSB {
	
	int id;
	String name;
	String Email;
	public WorkersSB() {
		super();
		// TODO Auto-generated constructor stub
	}
	public WorkersSB(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		Email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Override
	public String toString() {
		return "WorkersSB [id=" + id + ", name=" + name + ", Email=" + Email + "]";
	}
	
	

}
