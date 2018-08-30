package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class User {
	private Long id;
	private String username;
	private String password;
	private String favMovie;
	
	
	
	
	
	public User(Long id, String username, String password, String favMovie) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.favMovie = favMovie;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFavMovie() {
		return favMovie;
	}
	public void setFavMovie(String favMovie) {
		this.favMovie = favMovie;
	}
	
	
	public static List<User>getUsers(){
		List<User>users=new ArrayList<>(Arrays.asList(
				new User(1L,"Gsalah","1867","The Darknight"),
				new User(2L,"Husam","1234","Inception")
				
				));
		return users;
		
	}
	
	public static Long checkUser(String username,String password) {
		for(User user : getUsers()) {
			if(user.username.equals(username)&&user.password.equals(password)) {
				return user.id;
			}
		}
		return -1L;
	}
	public static User getUser(Long id) {
		for(User user : User.getUsers())
			if(user.getId()==id) 
				return user;
		return null;
	}


	
	
}
