package com.orm.utils;

import java.lang.reflect.Method;

/**
 * 反射操作类
 * @author flutterfire
 * @date	2016年10月8日
 *
 */
public class ReflectUtils {
	/**
	 * 调用obj对象对应属性fieldName的get方法
	 * @param fieldName
	 * @param obj
	 * @return
	 */
	public static Object invokeGet(String fieldName,Object obj){
		try {
			Class<?> c = obj.getClass();
			Method m = c.getDeclaredMethod("get"+StringUtils.firstChar2UpperCase(fieldName));
			return m.invoke(obj);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} 
	}
	
	
	public static void invokeSet(Object obj,String columnName,Object columnValue){
		try {
			Method m = obj.getClass().getDeclaredMethod("set"+StringUtils.firstChar2UpperCase(columnName), 
					columnValue.getClass());
			m.invoke(obj, columnValue);
		} catch (Exception e) {
			e.printStackTrace();
		} 

	}
}
