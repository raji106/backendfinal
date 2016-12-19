package com.niit.backend.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.CardDetails;

@Repository("carddetailsdaoimpl")
@Transactional
public class CardDetailsDaoimpl implements CardDetailsDao {
@Autowired
private SessionFactory sessionFactory;
public CardDetailsDaoimpl(SessionFactory sessionFactory)
{
	this.sessionFactory=sessionFactory;
	
}
	public void saveOrUpdate(CardDetails cardDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(cardDetails);
		
	}

}
