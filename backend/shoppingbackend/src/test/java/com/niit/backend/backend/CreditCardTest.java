package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CreditCardDao;
import com.niit.backend.model.CreditCard;


public class CreditCardTest 
{
	 public static void main( String[] args )
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.backend");
			context.refresh();
			CreditCardDao creditCardDao = (CreditCardDao) context.getBean("CreditCardDao");
			CreditCard creditCard =(CreditCard) context.getBean("creditCard");
		     creditCard.setS_No(1);
		     creditCard.setNameOnCard("SBI");
		     creditCard.setMonth(05);
		     creditCard.setYears(2020);
		     creditCard.setCvv(4321);
		     creditCard.setCardNumber(654398721);
		     creditCardDao.saveOrUpdate(creditCard);
	System.out.println( "objects are created successfully");
		
		}		
}
