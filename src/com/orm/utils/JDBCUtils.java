package com.orm.utils;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * jdbc常用操作
 * @author flutterfire
 * @date	2016年10月8日
 *
 */
public class JDBCUtils {
	/**
	 * //给sql设参
	 * @param ps 预编译sql语句对象
	 * @param params 参数
	 */
	public static void handleParams(PreparedStatement ps,Object[] params){
		if(params!=null){
			for(int i=0;i<params.length;i++){
				try {
					ps.setObject(1+i, params[i]);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
