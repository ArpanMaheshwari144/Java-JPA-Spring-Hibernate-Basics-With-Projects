// neon database project

package com.arpan.MyHibernate;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

// open mysql workbench then use neon database
public class App 
{
    public static void main( String[] args )
    {
//    	AlienName an = new AlienName();
//    	an.setFname("Arpan");
//    	an.setLname("Maheshwari");
//    	an.setMname("Vijay");
//    	
//        Alien arpan = new Alien();
//        arpan.setAid(101);
//        arpan.setColor("Green");
//        arpan.setAname(an);
//        
//        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);  
//        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
//        SessionFactory sf = con.buildSessionFactory(reg);
//        Session session = sf.openSession();
//        
//        Transaction tx = session.beginTransaction();
//        
//        session.save(arpan);
//        
//        tx.commit();
//        
//        System.out.println(arpan);
    
    	
    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(101);
//    	laptop.setLname("Dell");
//    	
//    	
//    	Student s = new Student();
//    	s.setName("Arpan");
//    	s.setRollno(1);
//    	s.setMarks(50);
//    	
//    	//For OneoToOne
//    	//s.setLaptop(laptop);
//    	
//    	//For One To Many
//    	s.getLaptop().add(laptop);
//    	
//    	laptop.getStudent().add(s);
//    	
//    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
//    	SessionFactory sf = config.buildSessionFactory(registry);
//    	Session session = sf.openSession();
//    	
//    	session.beginTransaction();
//    	
//    	session.save(laptop);
//    	session.save(s);
//    	
//    	session.getTransaction().commit();
    	
    	
    	
//    	Alien a = null;
//    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Alien.class);
//    	ServiceRegistry registry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
//    	SessionFactory sf = config.buildSessionFactory(registry);
//    	Session session1 = sf.openSession();
//    	session1.beginTransaction();
//    	Query q1 = session1.createQuery("from Alien where aid=101");
//    	q1.setCacheable(true);
//    	
//    	//a = (Alien)session1.get(Alien.class, 101);
//    	a = (Alien)q1.uniqueResult();
//    	System.out.println(a);
//    	
//    	session1.getTransaction().commit();
//    	session1.close();
//    	
//    	Session session2 = sf.openSession();
//    	session2.beginTransaction();
//    	Query q2 = session2.createQuery("from Alien where aid=101");
//    	q2.setCacheable(true);
//    	
//    	//a = (Alien)session2.get(Alien.class, 101);
//    	a = (Alien)q2.uniqueResult();
//    	System.out.println(a);
//    	
//    	session2.getTransaction().commit();
//    	session2.close();
    	
    	
    	
//    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
//    	SessionFactory sf = config.buildSessionFactory();
//    	Session session = sf.openSession();
//    	
//    	session.beginTransaction();
//    	
//    	Laptop l = new Laptop();
//    	l.setLid(105);
//    	l.setLname("Lenovo");
//    	l.setPrice(50000);
//    	
//    	session.save(l);
//    	l.setPrice(700);
//    	
//    	session.getTransaction().commit();
//    	
//    	session.evict(l);
//    	l.setPrice(600);
    	
    	
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class);
    	SessionFactory sf = config.buildSessionFactory();
    	Session session = sf.openSession();
    	
    	session.beginTransaction();
    	
    	// get hit the database
//    	Laptop l1 = (Laptop) session.get(Laptop.class, 101);
//    	System.out.println(l1);
    	
    	Laptop l2 = (Laptop) session.load(Laptop.class, 101);
    	System.out.println(l2);
    	
    	
    	session.getTransaction().commit(); 	
    }
}
