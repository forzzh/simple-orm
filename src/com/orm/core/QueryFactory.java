package com.orm.core;

public class QueryFactory {
	
	private static Query prototypeObj;  //原型对象
	static {
		
		try {
			String db = DBManager.getConf().getUsingDB();
			Class c = Class.forName(getClassNameByDB(db));  ////加载指定的query类
			prototypeObj = (Query) c.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}  
		
		//加载po包下面所有的类，便于重用，提高效率！
		TableContext.loadPOTables();
		
		
	}
	
	private QueryFactory(){  //私有构造器
	}
	
	
	public static Query createQuery(){
		try {
			return (Query) prototypeObj.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static String getClassNameByDB(String db) {
		if ("mysql".equalsIgnoreCase(db)) {
			return "com.orm.core.MySqlQuery";
		}
		return null;
	}
	
}
