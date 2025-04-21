package com.example.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import models.emp;

public class App {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myinut");
		EntityManager em = emf.createEntityManager();
		emp e2=new emp();
		e2.setEmail("swarajyakadimcharla@gmail.com");
		e2.setPassword("12345");
		EntityTransaction et = em.getTransaction();
		try {
			et.begin();
			em.persist(e2);
			et.commit();
			System.out.println("Successfully inserted");
//			int id=1;
//			et.begin();
//			emp e=em.find(emp.class, id);
//			if(e!=null) {
////				em.remove(e);
////				System.out.println("Successfully deleted");
////				et.commit();
//				e.setEmail("swarajyakadimcharla@gmail.com");
//				e.setPassword("123456");
//				em.merge(e);
//				et.commit();
//				System.out.println("data updated successfully");
//			}
//			else {
//				System.out.println("Employee not found with this record");
//			}
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			emf.close();
			em.close();
		}

	}
}
