package com.deloitte.telcom.ui;



	import java.util.Scanner;
	import java.util.Set;

import com.deloitte.telcom.entities.Mobile;
import com.deloitte.telcom.service.IMobileService;
import com.deloitte.telcom.service.MobileServiceImpl;

import java.util.Collection;
import com.deloitte.telcom.dao.MobileDaoImpl;


	public class MobileUi {
	    private IMobileService service = new MobileServiceImpl(new MobileDaoImpl());

	    public static void main(String[] args) {
	        MobileUi ui = new MobileUi();
	        ui.runUi();
	    }
	    public void runUi() {
	        try {

	            System.out.println("MENU");
	            System.out.println("Select an option: ");
	            System.out.println("1. Account Balance Enquiry");
	            System.out.println("2. Recharge Account");
	            System.out.println("3. Create Account");
	            System.out.println("4. Exit ");
	            Scanner sc=new Scanner(System.in);
	            int choice=sc.nextInt();
	            switch(choice)
	            {
	            case 1:   Mobile w1 = new Mobile("9491651719","Sowmya", 700);
	                          Mobile  w2=new Mobile("986754321","Aarthi",100);
	            	          service.addMobile(w1);
	                          service.addMobile(w2);
	                          System.out.println("Enter the mobile number:");
	                          Scanner s=new Scanner(System.in);
	                          String str=s.nextLine();
	                          Mobile fetched1 = service.findBymobno(str);
	                          System.out.println(fetched1.getName());
	                          System.out.println(fetched1.getBalance());
	                          break;
	            case 2:   Mobile w77 = new Mobile("9491651719","Ram", 700);
	                           Mobile  w88=new Mobile("6755675542","Sam",100);
	            	           service.addMobile(w77);
	                            service.addMobile(w88);
	                           System.out.println("Enter the mobile number:");
	                          Scanner st=new Scanner(System.in);
	                          String str1=st.nextLine();
	                          Mobile fetched2 = service.findBymobno(str1);       
	                          String newname=fetched2.getName();
	                          double bal=fetched2.getBalance();
	                          //System.out.println(fetched2.getName());
	                          //System.out.println(fetched2.getBalance());
	                          Mobile fetched7=service.rechargeAmount(str1,newname,bal); 
	                          //System.out.println(fetched7.getName());
	                          //System.out.println(fetched7.getBalance());
	                         // Set<Mobile> mobile8= service.allMobiles();
	                         // print(mobile8);
	                          break;
	            case 3: System.out.println("Enter mobile number");
	                         Scanner s3=new Scanner(System.in);
	                         String mobno=s3.nextLine();
	                         System.out.println("Enter the name: ");
	                         Scanner s4=new Scanner(System.in);
	                         String name=s4.nextLine();
	                         System.out.println("Enter the initial balance amount: ");
	                         Scanner s5=new Scanner(System.in);
	                         double bamt=s5.nextDouble();
	                         Mobile w4 = new Mobile(mobno,name, bamt);
	                         service.addMobile(w4);
	                         System.out.println("Account created: ");
	                         Set<Mobile> mobiler= service.allMobiles();
	                         print(mobiler);
	                         break;
	            default:  System.out.println("Exiting the system...");
	            	            System.exit(0);
	                            break;

	   }}
	            catch (Throwable e){
	            e.printStackTrace();
	            System.out.println("something went wrong");
			}
		}
	    void print(Collection<Mobile>mobiles){
	        for (Mobile w:mobiles){
	            System.out.println(w.getName());
	            System.out.println(w.getMobileNo());
	            System.out.println(w.getBalance());
	        }
	    }
}

