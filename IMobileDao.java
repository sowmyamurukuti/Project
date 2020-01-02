package com.deloitte.telcom.dao;

import java.util.Map;
import java.util.Set;

import com.deloitte.telcom.entities.Mobile;

public interface IMobileDao {




	    Mobile findBymobno(String mobileno);

	    Set<Mobile> allMobiles();

		void addMobile(Mobile w);

		Mobile rechargeAmount(String str1, String name, double amount);

        Map<String, Mobile> getStore();
	}

