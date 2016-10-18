package com.orm.po;

import java.sql.*;
import java.util.*;

public class User {

	private Integer id;
	private Integer age;
	private String name;


	public Integer getId(){
		return id;
	}
	public Integer getAge(){
		return age;
	}
	public String getName(){
		return name;
	}
	public void setId(Integer id){
		this.id=id;
	}
	public void setAge(Integer age){
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
}
