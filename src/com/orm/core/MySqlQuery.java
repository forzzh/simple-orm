package com.orm.core;

import java.util.List;

import com.orm.po.User;

/**
 * 负责针对Mysql数据库的查询
 */
public class MySqlQuery extends Query {
	
	public static void testDelete(){
		User user = new User();
		user.setId(2);
		new MySqlQuery().delete(user);
	}
	
	public static void testUpdate(){
		User user = new User();
		user.setId(2);
		user.setAge(14);
		new MySqlQuery().update(user, new String[]{"age"});
	}
	
	public static void testInsert(){
		User user = new User();
		user.setId(2);
		user.setAge(18);
		user.setName("Lily");
		new MySqlQuery().insert(user);
	}
	
	public static void testQueryRows(){
		List<User> users = new MySqlQuery().queryRows("select id, age from user",
				User.class, null);
		for(User user : users){
			System.out.println(user.getAge());
		}
		
	}
	
	public static void testQueryValue () {
		Integer age = (Integer) new MySqlQuery().queryValue("select age from user where id = ?", new Object[]{1});
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
//		testDelete();
		
//		testInsert();
//		testUpdate();
		testQueryValue();
//		testQueryRows();
	}

	@Override
	public Object queryPagenate(int pageNum, int size) {
		return null;
	}

}
