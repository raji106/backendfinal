package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.CreditCard;

public interface CreditCardDao
{
public List<CreditCard> list();
	
	public CreditCard get(String id);
	
	public void saveOrUpdate(CreditCard creditcard);
	
	public void delete(String id);
	
	public void editCreditCard(CreditCard creditcard);
	
}
