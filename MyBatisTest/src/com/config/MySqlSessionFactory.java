package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	//static 변수
	static String resource = null;
	static InputStream inputStream = null;
	static SqlSessionFactory sqlSessionFactory = null;
	
	static {
		resource = "com/config/configuration.xml";
		
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	//SqlSession 리턴하는 메서드
	public static SqlSession getSession() {
		SqlSession session = sqlSessionFactory.openSession();
		
		return session;
	}
}
