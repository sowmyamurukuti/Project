package com.deloitte.telcom.service;

import java.util.Set;

import com.deloitte.telcom.dao.IMobileDao;
import com.deloitte.telcom.entities.Mobile;

public interface IMobileService {
	void addMobile(Mobile w);

	Mobile findBymobno(String name);

	Set<Mobile> allMobiles();

	Mobile rechargeAmount(String str1, String name, double amount);

	IMobileDao getDao();

}
