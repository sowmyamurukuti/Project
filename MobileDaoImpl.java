package com.deloitte.telcom.dao;
import java.util.*;

import com.deloitte.telcom.entities.Mobile;
import com.deloitte.telcom.exceptions.MobileNumNotFoundException;


public class MobileDaoImpl implements IMobileDao {
	
       public Map<String, Mobile> getStore1(){
    	   return store;
       }
       

		private Map<String, Mobile> store=new HashMap<String, Mobile>();

		 public void addMobile(Mobile w)
		 	{
		     store.put(w.getMobileNo(), w);
		    }

		  
		    public Mobile findBymobno(String mobileno) {
		        Mobile w = store.get(mobileno);
		        if (w == null) {
		            throw new MobileNumNotFoundException("Account not found for mobile no=" +mobileno);
		        }
		        return w;
		    }

		    public Set<Mobile> allMobiles() {
		        Collection<Mobile> mobiles = store.values();
		        Set<Mobile> MobileSet = new HashSet<>(mobiles);
		        return MobileSet;
		    }

			public Mobile rechargeAmount(String str1, String name, double amount) {
				System.out.println("Enter the recharge amount:");
				Scanner t=new Scanner(System.in);
				double rechamt=t.nextDouble();
				double newbal=rechamt+amount;
				Mobile w9 = new Mobile(str1,name,newbal);
				double loft=w9.getBalance();
				System.out.println(w9.getName());
				System.out.println(w9.getMobileNo());
				System.out.println("New Balance="+loft);
				Mobile y=store.put(str1, w9 );
				return y;
			}


			@Override
			public Map<String, Mobile> getStore() {
				// TODO Auto-generated method stub
				return null;
			}
	}


