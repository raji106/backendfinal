package com.niit.backend.DAO;

import org.springframework.stereotype.Repository;

import com.niit.backend.model.CardDetails;
@Repository
public interface CardDetailsDao {
	void saveOrUpdate(CardDetails cardDetails);
	
}
