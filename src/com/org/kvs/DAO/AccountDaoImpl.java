package com.org.kvs.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.org.kvs.DTO.Account;
import com.org.kvs.Utility.HibernateUtility;

public class AccountDaoImpl implements AccountDao
{

	@Override
	public int createAccount(Account acc) {
 
		int id=0;
		Session session=HibernateUtility.getSession();
 		if(session!=null){
			Transaction transaction=session.beginTransaction();
			id=(int) session.save(acc);
			transaction.commit();
			session.close();
		}
		return id;
	}

	@Override
	public void updateAccountHolderName(int accNum, String newName) {
 
		Session session=HibernateUtility.getSession();
		if(session!=null){
			Account account=session.get(Account.class, accNum);
			if(account!=null){
				account.setName(newName);
				session.update(account);
				session.beginTransaction().commit();
				System.out.println("Record Update : "+accNum);
				session.close();
			}else{
				System.out.println("Account Not Found");
			}
		}
	}

	@Override
	public void deleteAccount(int accNum) {
 
		Session session=HibernateUtility.getSession();
		if(session!=null){
			Account account=session.get(Account.class, accNum);
			if(account!=null){
				session.delete(account);
				session.beginTransaction().commit();
				System.out.println("Record Delete : "+accNum);
				session.close();
			}else{
				System.out.println("Account Not Found");
			}
		}
	}

	@Override
	public Account searchAccount(int accNum) {
 
		Account acc=null;
		Session session=HibernateUtility.getSession();
		if(session!=null){
			acc=session.get(Account.class,accNum);
			
		}
		return acc;
	}
	

}
