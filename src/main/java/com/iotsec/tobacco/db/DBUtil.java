package com.iotsec.tobacco.db;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class DBUtil {

	/**
	 * @param args
	 */

	private static SessionFactory sessionFactory;

	private DBUtil() {
	}
	

	public static SessionFactory getInstance(){
		if(sessionFactory==null){
			synchronized(DBUtil.class){
				if(sessionFactory==null){
					Configuration config = new Configuration();
					config.configure();
					StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder(); 
					ServiceRegistry serviceRegistry = serviceRegistryBuilder.applySettings(config.getProperties()).build();
					sessionFactory = config.buildSessionFactory(serviceRegistry); 					
				}
			}
			
		}
		return sessionFactory;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
