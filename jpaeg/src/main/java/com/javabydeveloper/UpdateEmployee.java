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
public class UpdateEmployee {

	public static void main(String[] args) {
		try {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Emp");
		EntityManager em = emf.createEntityManager();		 

			Query q = em.createQuery("select e from Emp e");
			List<Emp> resultList = q.getResultList();
			System.out.println("num of employees:" + resultList.size());
			
			System.out.println("Before update of list of Employee's:");
			for (Emp next : resultList) {
				System.out.println("Employee:No " + next.getEmpno());
				System.out.println("Employee:Name " + next.getEmpname());
			}
			em.getTransaction().begin();
			
			
			Emp emp1=(Emp)em.find(Emp.class, 4);
			emp1.setEmpname("Raja");			 
			em.getTransaction().commit();
			
			
			
			System.out.println("updated employee of 1");
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
