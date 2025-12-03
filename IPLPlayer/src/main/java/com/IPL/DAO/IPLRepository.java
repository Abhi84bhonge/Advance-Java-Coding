package com.IPL.DAO;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.IPL.Entity.IPLPlayer;

@Repository
public class IPLRepository {

	
	@Autowired
	private SessionFactory sf;
	
	public boolean addPlayer(IPLPlayer player) {
		Session sn=sf.openSession();
		sn.save(player);
		sn.beginTransaction().commit();
		sn.close();
		return true;
	}

	public List<IPLPlayer> getallPlayer() {
		Session sn=sf.openSession();
		List<IPLPlayer> lt=sn.createQuery("from IPLPlayer",IPLPlayer.class).list();
		if(lt==null) {
			return lt=null;
		}else {
		sn.beginTransaction().commit();
		sn.close();
		return lt;
	}
	}

	public boolean updateplayerById(int pid) {

	    Session sn = sf.openSession();
	    sn.beginTransaction();

	    IPLPlayer lt = sn.get(IPLPlayer.class, pid);
	    if (lt == null) {
	        System.out.println("Player not found!");
	        sn.getTransaction().rollback();
	        sn.close();
	        return false;
	    }

	    Scanner sc = new Scanner(System.in);

	    System.out.println("1. Update Innings Played");
	    System.out.println("2. Update Number of Catches");
	    System.out.println("3. Update Wickets");
	    System.out.println("4. Update Score");
	    System.out.println("5. Update Player Name");
	    System.out.println("6. Update Team Name");
	    System.out.println("---------------------------------");
	    System.out.println("Enter your choice: ");
	    int choice = sc.nextInt();
	    sc.nextLine(); // to clear buffer
	    System.out.println("---------------------------------");

	    switch (choice) {

	        case 1:
	            System.out.println("Enter updated innings played: ");
	            int inning = sc.nextInt();
	            lt.setIngPlayed(inning);
	            break;

	        case 2:
	            System.out.println("Enter updated number of catches: ");
	            int catches = sc.nextInt();
	            lt.setNumberCatches(catches);
	            break;

	        case 3:
	            System.out.println("Enter updated wickets: ");
	            int wickets = sc.nextInt();
	            lt.setWickets(wickets);
	            break;

	        case 4:
	            System.out.println("Enter updated score: ");
	            int score = sc.nextInt();
	            lt.setScore(score);
	            break;

	        case 5:
	            System.out.println("Enter updated player name: ");
	            String pname = sc.nextLine();
	            lt.setpName(pname);
	            break;

	        case 6:
	            System.out.println("Enter updated team name: ");
	            String tname = sc.nextLine();
	            lt.settName(tname);
	            break;

	        default:
	            System.out.println("Invalid choice!");
	            sn.getTransaction().rollback();
	            sn.close();
	            return false;
	    }

	    sn.update(lt);
	    sn.getTransaction().commit();
	    sn.close();

	    System.out.println("Player updated successfully!");
	    return true;
	
	}

	public IPLPlayer getplayerById(int pid) {
	Session sn=sf.openSession();
	IPLPlayer player=sn.get(IPLPlayer.class, pid);
	return player;
	}

	

	public List<IPLPlayer> getPlayerStartName(String startwords) {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(IPLPlayer.class);
		
		ct.add(Restrictions.like("pName", startwords.trim()+"%"));
		
		return ct.list();
		
	}

	public List<IPLPlayer> getPlayerEndName(String endwith) {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(IPLPlayer.class);
		
		ct.add(Restrictions.like("pName", "%"+endwith.trim()));
		
		return ct.list();
		
	}

	public List<IPLPlayer> getPlayerScoreMore1k(int score) {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(IPLPlayer.class);
		ct.add(Restrictions.gt("score", score));
		return ct.list();
	}

	public List<IPLPlayer> getWicket() {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(IPLPlayer.class);
		ct.add(Restrictions.between("score", 100, 200));
		return ct.list();
		
	}

	public List<IPLPlayer> getSortedScorePlayer() {
		Session sn=sf.openSession();
		Criteria ct=sn.createCriteria(IPLPlayer.class);
		ct.addOrder(Order.desc("score"));
		List<IPLPlayer> lt=ct.list();
		return lt;
	}

	}

	   
	   
	

