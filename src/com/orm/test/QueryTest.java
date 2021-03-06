package com.orm.test;

import java.util.List;

import com.orm.core.MySqlQuery;
import com.orm.core.Query;
import com.orm.core.QueryFactory;
import com.orm.po.User;

public class QueryTest {

	public static void testQueryFactiory() {
		Query query = QueryFactory.createQuery();
		User user = new User();
		user.setAge(18);
		user.setName("zhangsan");
		user.setId(3);
		query.insert(user);
	}
	
	public static void testQueryRow() {
		Query query = QueryFactory.createQuery();
		List<User> users = query.queryRows("select id, age from user",
				User.class, null);
		for(User user : users){
			System.out.println(user.getAge());
		}
	}
	
	public static void main(String[] args) {
		testQueryRow();
	}
	
	
}
