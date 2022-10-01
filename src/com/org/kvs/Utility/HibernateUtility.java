package com.org.kvs.Utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
 import org.hibernate.cfg.Configuration;

public class HibernateUtility 
{
 
	
	private static Session session=null;
	static{
		Configuration config=new Configuration().configure();
		SessionFactory sessionFactory=config.buildSessionFactory();
		 session=sessionFactory.openSession();
 	}
	
	 public static Session getSession(){
 		return session;
	} 

}
