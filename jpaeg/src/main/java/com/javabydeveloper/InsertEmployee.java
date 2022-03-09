package com.javabydeveloper;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.javabydeveloper.domain.Emp;
 

/**
 * JPA Hello world!
 *
 */
public class InsertEmployee {

	public static void main(String[] args) {
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Emp");
		EntityManager em = emf.createEntityManager();		 

			Query q = em.createQuery("select e from Emp e");
			List<Emp> resultList = q.getResultList();
			System.out.println("num of employees:" + resultList.size());
			
			System.out.println("Before insert of list of Employee's:");
			for (Emp next : resultList) {
				System.out.println("Employee:No " + next.getEmpno());
				System.out.println("Employee:Name " + next.getEmpname());
			}
			em.getTransaction().begin();
			Emp emp1=new Emp();
			emp1.setEmpno(4);
			emp1.setEmpname("jai1");
			em.persist(emp1);
			
			Emp emp2=new Emp();
			emp2.setEmpno(5);
			emp2.setEmpname("karthi");
			em.persist(emp2);
			em.getTransaction().commit();
			Query q1 = em.createQuery("select e from Emp e");

			List<Emp> resultList1 = q1.getResultList();
			System.out.println("After insert of list of Employee's:");
			for (Emp next : resultList1) {
				System.out.println("Employee:No " + next.getEmpno());
				System.out.println("Employee:Name " + next.getEmpname());
			}
			
			
			
			
			
			
			
			emf.close();
			em.close();
			
			

		} catch (Exception e) {
			System.out.println(e); 
		}  
	}
}
