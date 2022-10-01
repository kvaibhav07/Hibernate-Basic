package com.org.kvs.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.org.kvs.DTO.Employee;

public class Test2
{
	public static void main(String[] args)
	{
		Configuration confi=new Configuration().configure();
		SessionFactory sessionFactory=confi.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Employee emp=new Employee();
		emp.setEmpno(107);
		emp.setDeptno(207);
		emp.setName("KUVAR VAIBHAV SINGH");
		emp.setDeptname("Information Technology");
		emp.setSalary(999787890);
		
		
		Integer i=(Integer)session.save(emp);
		System.out.println("Insert Value : "+i);
		transaction.commit();
		session.close();
	}

}
