package com.org.kvs.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.org.kvs.DTO.Account;

public class Test 
{
	public static void main(String[] args)
	{
		
		Configuration configure=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=configure.buildSessionFactory();
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		
		Account account=new Account();
		account.setAccNum(11);
		account.setName("Kuvars");
		account.setBalance(92345679.07);
		
		
		 
		session.saveOrUpdate(account);
		transaction.commit();
		
		//session.close();
		
		
	}

}
