package com.UPI.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class UPICustomer {

    @Id
    private long accNo;

    private String holderName;
    private String address;
    private double balance;

    @Column(unique = true)
    private int upiPin;

    public static final double withdrawlimit = -10000.0;

    public UPICustomer() {}

    public UPICustomer(long accNo, String holderName, double balance, String address, int upiPin) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
        this.address = address;
        this.upiPin = upiPin;
    }

    public long getAccNo() {
        return accNo;
    }

    public void setAccNo(long accNo) {
        this.accNo = accNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {        // ✔ NO ERROR
        return balance;
    }

    public void setBalance(double balance) {  // ✔ NO ERROR
        this.balance = balance;
    }

    public int getUpiPin() {
        return upiPin;
    }

    public void setUpiPin(int upiPin) {
        this.upiPin = upiPin;
    }

	@Override
	public String toString() {
		return "UPICustomer [accNo=" + accNo + ", holderName=" + holderName + ", address=" + address + ", balance="
				+ balance + "]";
	}
    
}
