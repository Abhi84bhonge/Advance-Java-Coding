package com.UPI.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.UPI.Entity.UPICustomer;
import com.UPI.Service.UPIService;

@RestController
@RequestMapping("/upi")
public class UPIController {

    @Autowired
    private UPIService service;

    @GetMapping("/getName/{accNo}")
    public String getname(@PathVariable long accNo) {
    	System.out.println("Account number is "+accNo+" Account Holder Name "+service.getNamebyaccNo(accNo));
    	return service.getNamebyaccNo(accNo);
    }
    
    @PostMapping("/add")
    public String addCustomer(@RequestBody UPICustomer cust) {
        return service.addCustomer(cust);
    }

    @GetMapping("/customer/{accNo}")
    public UPICustomer getCustomer(@PathVariable long accNo) {
        return service.getCustomer(accNo);
    }
    
    
    @PutMapping("/deposit/{accNo}/{amount}")
    public String deposit(@PathVariable long accNo, @PathVariable double amount) {
        return service.depositAmount(accNo, amount);
    }

    @PutMapping("/withdraw/{accNo}/{amount}/{pin}")
    public String withdraw(@PathVariable long accNo, @PathVariable double amount, @PathVariable int pin) {
    	return service.withdrawAmount(accNo, amount, pin);
    }
}
