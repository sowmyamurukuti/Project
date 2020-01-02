package com.deloitte.telcom.service;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.*;


import com.deloitte.telcom.dao.MobileDaoImpl;
import com.deloitte.telcom.entities.Mobile;


public class MobileServiceImplTest {
	@Test
	public void testSomething() 

	{
		MobileServiceImpl service= new MobileServiceImpl(new MobileDaoImpl());
		String mobileno= "9491651719";
		String name="Sowmya";
		double balance= 700;
		Mobile m1= new Mobile(mobileno, name, balance);
		service.addMobile(m1);
		Map<String, Mobile>store = service.getDao().getStore();
		Mobile expected= store.get(mobileno);
		
		//Mobile mobile=service.addMobile(m1);
		Assert.assertNotNull(m1);
		//double resultBalance= account.getAccountBalance();
		Assert.assertEquals(expected,m1);
		//Assert.assertEquals(name.account.getCustomer.Name());
        System.out.print("Finish");
		
		
		
		//Assert.assertEquals(expected,m1);
		

		
}}
