package com.example.crud;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import models.emp;

public class main1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa-unit");
		EntityManager em = emf.createEntityManager();
		try {
			List<emp> li=em.createQuery("from emp",emp.class).getResultList();
			for(emp e:li) {
				System.out.println("id :"+e.getId());
				System.out.println("email :"+e.getEmail());
				System.out.println("password :"+e.getPassword());
			}
			
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		finally {
			emf.close();
			em.close();
		}

	}

}
