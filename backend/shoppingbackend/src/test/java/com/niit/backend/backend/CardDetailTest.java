package com.niit.backend.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CardDetailsDao;
import com.niit.backend.model.CardDetails;

public class CardDetailTest {
	 public static void main( String[] args )
		{
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			context.scan("com.niit.backend");
			context.refresh();
			CardDetailsDao cardDetailsDao = (CardDetailsDao) context.getBean("carddetailsdaoimpl");
			CardDetails cardDetails =(CardDetails) context.getBean("cardDetails");
			cardDetails.setCardDetailId("45");
			cardDetails.setCardNumber("5464636774");
			cardDetails.setCustomerId("cu12");
			cardDetails.setCvNumber("011");
			cardDetails.setExpiryMonth("13");
			cardDetails.setExpiryYear("2017");
			cardDetails.setNameOnCard("jithu");
			cardDetails.setTotalCost(56000);
			cardDetailsDao.saveOrUpdate(cardDetails);
			System.out.println( "objects are created successfully");
		}
}
