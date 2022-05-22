package io.rspc.springbootstarter.topic;

public class Topic {
	
	private String id;
	private String name;
	private String publication;
	
	public Topic() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Topic(String id, String name, String publication) {
		super();
		this.id = id;
		this.name = name;
		this.publication = publication;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	
}
