package com.deloitte.telcom.service;

import java.util.Set;

import com.deloitte.telcom.dao.IMobileDao;
import com.deloitte.telcom.entities.Mobile;
import com.deloitte.telcom.exceptions.CustomerNotFoundException;
public class MobileServiceImpl implements IMobileService {
	private IMobileDao dao;
    public MobileServiceImpl(IMobileDao dao) {
		this.dao = dao;
	}


	public void addMobile(Mobile w) 
	{
    dao.addMobile(w);
	}

	
    public Mobile findBymobno(String mobileno){
        if (mobileno==null||mobileno.length()!=10 ) {
            throw new CustomerNotFoundException("Number is incorrect");
        }
        Mobile w = dao.findBymobno(mobileno);
        return w;
    }

	
	public Set<Mobile> allMobiles() {
		Set<Mobile> mobiles = dao.allMobiles();
		return mobiles;
	}

	public Mobile rechargeAmount(String str1, String name, double amount) {
		Mobile r=dao.rechargeAmount(str1,name, amount);
		return r;
	}


	@Override
	public IMobileDao getDao() {
		// TODO Auto-generated method stub
		return null;
	}


	
}

	


