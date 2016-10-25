package com.orm.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * 回调接口
 */
public interface OrmCallBack {
	
	public Object doExecute(Connection conn, PreparedStatement ps, ResultSet rs);
	
}
