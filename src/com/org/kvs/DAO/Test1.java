package com.org.kvs.DAO;

import com.org.kvs.DTO.Account;

public class Test1
{
	public static void main(String[] args) 
	{
		AccountDao accDao=new AccountDaoImpl();
		
		/*Account acc=new Account();
		acc.setName("Mudit Singh");
		acc.setBalance(999999990);
		int id=accDao.createAccount(acc);
		if(id>0){
			System.out.println("User Account Created : "+id);
		}else{
			System.out.println("User Account Not Created ");
		}
		*/
		/*System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		accDao.updateAccountHolderName(1,"Vaibhav");*/
		
		/*System.out.println("#############################");
		accDao.deleteAccount(3);*/
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		Account account=accDao.searchAccount(1);
		if(account!=null){
			System.out.println(account);
		}else{
			System.out.println("Account not Found");
		}

	}

}
