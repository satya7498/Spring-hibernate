package in.stack.hibernatedemo.model;

import org.hibernate.Transaction;


import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import in.stack.hibernatedemo.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Transaction transaction = null;
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		 
		try {
			
			   transaction = session.beginTransaction();
		    
		    
		Set<Customers> cus = new HashSet<Customers>();
		
		cus.add(new Customers("satya","34562882"));
		cus.add(new Customers("ananya","34546882"));
		
		Shop shop = new Shop("Nykaa",cus);
		
		session.save(shop);
		transaction.commit();
		
	
		} 
		
		catch (HibernateException e) {
		transaction.rollback();
		e.printStackTrace();
		}
		
		
		
			
		finally {
		     session.close();
		}
		
		
		}
	

}
