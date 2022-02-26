package com.arpan.MyJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

// open mysql workbench and then use arpan1 database
public class App 
{
    public static void main( String[] args )
    {
    		
    	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    	EntityManager em = emf.createEntityManager();
    	
//    	Alien a = em.find(Alien.class, 2);
//    	System.out.println(a);
    	
    	Alien a = new Alien();
    	a.setAid(4);
    	a.setAname("Adarsh");
    	a.setTech("BigData");
    	
    	em.getTransaction().begin();
    	em.persist(a);
    	em.getTransaction().commit();  
    }
}
