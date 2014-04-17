package com.hibernate.common;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	 private static final SessionFactory sessionFactory = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory(){
		SessionFactory buildsessionFactory = null;
	try{
		 // Create the SessionFactory from hibernate.cfg.xml
		 buildsessionFactory=new Configuration().configure().buildSessionFactory();
	}catch(Exception e){
		
		//Throw exception from here
		System.out.println("Exception while calling hibernate config "+e.getMessage());
	}
	
	
	return  buildsessionFactory;
	}
	
	public static SessionFactory getSessionFactory(){
		
		return sessionFactory;
	}
	
	
}
