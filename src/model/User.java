package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User{
	String name;
	String email;
	LocalDateTime date;
	public User(String name,String email,LocalDateTime dateTime)
	{
		this.name=name;
		this.email=email;
		this.date=dateTime;
		
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setDate(LocalDateTime date) {
		this.date=date;
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	LocalDateTime getDate() {
		return this.date;
	}
	
}