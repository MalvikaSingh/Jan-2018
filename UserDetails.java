package com.example.demo;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class UserDetails{
	private String UserId;
    private String Name;
    private String LLDate;
    private String Role;
    private String CRDate;
    private String Country;
    public UserDetails(String UserId, String Name, String LLDate, String Role,String CRDate, String Country) {
         this.UserId = UserId;
         this.Name = Name;
         this.LLDate = LLDate;
         this.Role = Role;
         this.CRDate = CRDate;
         this.Country=Country;
    }
    public String getName() {
         return Name;
    }
    public void setName(String Name) {
	this.Name = Name;
    }
    public String getUserId(String UserId) {
	return UserId;
    }
    public void setUserId(String rollno) {
	UserId = rollno;
    }
    public String getLLDate() {
	return LLDate;
    }
    public void setLLDate(String LLDate) {
 	this.LLDate = LLDate;
    }	
    public String getRole() {
    	return Role;
    }
    public void setRole(String Role) {
    	this.Role = Role;
    }
    public String getCRDate() {
    	return CRDate;
    }
    public void setCRDate(String CRDate) {
    	this.CRDate = CRDate;
    }
    public String getCountry() {
    	return Country;
    }
    public void setCountry(String Country) {
    	this.Country = Country;
    }
    @Override
    public String toString() {
        return "User{" +
                "Userid=" + UserId +
                ", Name='" + Name + '\'' +
                ", Last Login Date='" + LLDate + '\'' +
                ", Role='" + Role + '\'' +
                ", Creation Date='" + CRDate + '\'' +
                ", Country='" + Country + '\'' +
                '}';
    }
	public Long getId() {
		long n = 123456;
		// TODO Auto-generated method stub
		return (ThreadLocalRandom.current().nextLong(n));
	}

}