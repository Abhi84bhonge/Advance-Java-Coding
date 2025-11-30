package com.UPI.Repository;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.UPI.Entity.UPICustomer;

@Repository
public class UPIRepository {

    @Autowired
    private SessionFactory sf;

    // SAVE customer
    public boolean saveCustomer(UPICustomer cust) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(cust);   // Hibernate save
        session.getTransaction().commit();
        session.close();
        return true;
    }

    // GET customer by account number
    public UPICustomer getCustomer(long accNo) {
        Session session = sf.openSession();
        UPICustomer cust = session.get(UPICustomer.class, accNo);
        session.close();
        return cust;
        
    }
    
    

    // UPDATE customer
    public boolean updateCustomer(UPICustomer cust) {
        Session session = sf.openSession();
        session.beginTransaction();
        session.update(cust);  // Hibernate update
        session.getTransaction().commit();
        session.close();
        return true;
    }

    // DEPOSIT (update balance)
    public boolean deposit(long accNo, double amount) {
        Session session = sf.openSession();
        session.beginTransaction();

        UPICustomer cust = session.get(UPICustomer.class, accNo);
        if (cust != null) {
            cust.setBalance(cust.getBalance() + amount);
            session.update(cust);
        }

        session.getTransaction().commit();
        session.close();
        return true;
    }

    // WITHDRAW (update balance)
    public String withdraw(long accNo, double amount,int pin) {
        Session session = sf.openSession();
        session.beginTransaction();

        UPICustomer cust = session.get(UPICustomer.class, accNo);
        		
        if (cust != null&&cust.getUpiPin()==pin) {
            cust.setBalance(cust.getBalance() - amount);
            session.update(cust);
        }else {
               return "UPI PIN NOT CORRECT";
        }
         
        session.getTransaction().commit();
        session.close();
        return "Withdraw Successfully";
    }

	public String getNamebyaccNo(long accNo) {
		Session sn=sf.openSession();
		UPICustomer cust=sn.get(UPICustomer.class, accNo);
		sn.close();
		return cust.getHolderName();
		
	}
}
