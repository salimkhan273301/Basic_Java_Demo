package oneTomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OnetoMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
SessionFactory sessionFactory =new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		Session session=sessionFactory.openSession();
	
		Product p=new Product();
		p.setProductName("bag");
		p.setPrice(90.00);
		p.setQty(100.00);
		
		Product p1=new Product();
		p1.setProductName("bag1");
		p1.setPrice(90.00);
		p1.setQty(80.00);
		
		Set<Product> pset=new HashSet<Product>();
		
		pset.add(p);
		pset.add(p1);
		
		Account a=new Account();
		a.setName("Ram");
		a.setProducts(pset);
		
		session.beginTransaction();
		try{
			
			session.save(a);  
			session.getTransaction().commit();
			System.out.println("Data inserted successfully");
			
		}catch(HibernateException e){
			e.printStackTrace();
		}finally{
			if(session!=null){
				session.close();
			}
		}
		

	}

}
