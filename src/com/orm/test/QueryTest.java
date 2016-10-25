package com.orm.test;

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
	
	public static void main(String[] args) {
		testQueryFactiory();
	}
}
