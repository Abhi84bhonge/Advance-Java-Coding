package com.IPL.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.IPL.DAO.IPLRepository;
import com.IPL.Entity.IPLPlayer;

@Service
public class IPLService {

	@Autowired
	private IPLRepository repo;
	
	public String addPlayer(IPLPlayer player) {
	   if(repo.addPlayer(player)) {
		   return "Player Added Successfully";
	   }else {
		   return "Player Not add";
	   }
	}

	public List<IPLPlayer> getallPlayer() {
		return repo.getallPlayer();
	}

	public String updateplayerById(int pid) {
	        if(repo.updateplayerById(pid)) {
	        	return "updated successfully";
	        	
	        }else {
	        	return "not updated";
	        }
	}

	public IPLPlayer getplayerById(int pid) {
		return repo.getplayerById(pid);
	}


	public List<IPLPlayer> getPlayerStartName(String startwords) {
		return repo.getPlayerStartName(startwords);
	}

	public List<IPLPlayer> getPlayerEndName(String startwords) {
		return repo.getPlayerEndName(startwords);
	}

	public List<IPLPlayer> getPlayerScoreMore1k(int score) {
		return repo.getPlayerScoreMore1k(score);
	}

	public List<IPLPlayer> getWicket() {
		return repo.getWicket();
	}

	public List<IPLPlayer> getSortedScorePlayer(){
		return repo.getSortedScorePlayer();
	}
}
