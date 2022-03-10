package com.product.details;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Project Started...." );
        
        Configuration config = new Configuration();
        config.configure("hibernate.config.xml");
        
        SessionFactory factory = config.buildSessionFactory();
         
        //creating product object
        Product product = new Product();
        product.setProID(1004);
        product.setProName("Motor Bike");
        product.setProDescription("Amazing performnce and Picup!");
        product.setProManufectureDate("24/08/2020");
        product.setProExpiryDate("14/10/2024");
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(product);
        tx.commit();
        session.close();
        
        System.err.println(product);
        
        
    }
}
