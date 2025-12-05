package com.User.DAO;


//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.Entity.User;

// jpa repository is come from java.util package

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
	         
//   
//	@Autowired
//	private SessionFactory sf;
//    // Save user
//    public boolean save(User user) {
//       Session sn=sf.openSession();
//      sn.save(user);
//      sn.beginTransaction().commit();
//      sn.close();
//      return true;
//    }

   
}
