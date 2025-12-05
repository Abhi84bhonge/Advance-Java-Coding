package com.User.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.User.Entity.User;
import com.User.Service.UserService;

@Controller
public class UserController {

    @Autowired
    UserService service;
     
    @GetMapping("/")
    public String getindexPage() {
    	return "index";
    }
    
    @GetMapping("/getjsp")
    public String getPage() {
    	return "demo";
    }
    
    
    @GetMapping("/get-loginPage")
    public String getLoginPage() {
       return "login";           
}
   
    @GetMapping("/get-registerPage")
    public String getRegisterPage() {
    	return "register";
    }
    
    @PostMapping("/register-user")
    public String registeruser(User user) {
    	System.err.println("user >>>"+user.getFullname());
    	service.save(user);
    	return "login";
    }
    
    @PostMapping("/verify-login")
    public String verifylogin(String username,String password) {
    	System.err.println(username+" "+password);
    	System.err.println("login successfully!!");
       return "index";
    }
    
    
}
