package com.iotsec.tobacco.db;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBUtil {

	/**
	 * @param args
	 */

	private static SessionFactory sessionFactory;

	private DBUtil() {
	}
	
	@SuppressWarnings("deprecation")
	public static SessionFactory getInstance(){
		if(sessionFactory==null){
			synchronized(DBUtil.class){
				if(sessionFactory==null){
					Configuration config = new Configuration();
					config.configure();
					sessionFactory = config.buildSessionFactory();
				}
			}
			
		}
		return sessionFactory;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
