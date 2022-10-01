package com.org.kvs.DAO;

import com.org.kvs.DTO.Account;

public interface AccountDao
{
	public int createAccount(Account acc);
	public void updateAccountHolderName(int accNum,String newName);
	public void deleteAccount(int accNum);
	public Account searchAccount(int accNum);

}
