package com.UPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UPI.Entity.UPICustomer;
import com.UPI.Repository.UPIRepository;

@Service
public class UPIService {

    @Autowired
    private UPIRepository repo;

    // Add Customer
    public String addCustomer(UPICustomer cust) {
        repo.saveCustomer(cust);
        return "Customer Added Successfully";
    }

    // Get Customer
    public UPICustomer getCustomer(long accNo) {
        UPICustomer c = repo.getCustomer(accNo);
        if (c == null) {
            throw new RuntimeException("Account Not Found!");
        }
        return c;
    }

    // Deposit
    public String depositAmount(long accNo, double amount) {
        if (amount <= 0) return "Invalid Amount!";
        UPICustomer c = getCustomer(accNo);
        repo.deposit(accNo, amount);
        return "Deposit Successful! New Balance = " + (c.getBalance() + amount);
    }

    // Withdraw
    public String withdrawAmount(long accNo, double amount, int pin) {
        UPICustomer c = getCustomer(accNo);

        if (pin != c.getUpiPin()) return "Invalid UPI PIN!";
        if (c.getBalance() - amount < UPICustomer.withdrawlimit)
            return "Withdraw Limit Exceeded!";

        repo.withdraw(accNo, amount,pin);
        return "Withdraw Successful! Remaining Balance = " + (c.getBalance() - amount);
    }

	public String getNamebyaccNo(long accNo) {
		 if(accNo<0) {
			 return "Account No Not found";
		 }else {
			return "Account No "+accNo+" Account Holder Name "+ repo.getNamebyaccNo(accNo);
		 }
		
	}
}
