package com.hibernate.common;

import org.hibernate.Session;

import com.hibernate.modal.Stock;

public class AppStartPoint {

	
	public static void main(String[] args) {
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		//start the txn from here
		session.beginTransaction();
		
		//set all the vallues here
		Stock stock=new Stock();
		stock.setStockName("stock shares");
		stock.setStockCode("1500");
		stock.setStockId(100);
		
		session.save(stock);
		session.getTransaction().commit();
		
		
	}

}
