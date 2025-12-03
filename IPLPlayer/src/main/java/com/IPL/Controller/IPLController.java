package com.IPL.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.IPL.Entity.IPLPlayer;
import com.IPL.Service.IPLService;

@RestController
@RequestMapping("/IPL")
public class IPLController {

	@Autowired
	private IPLService service;
	
	@PostMapping("/addPlayer")
	public String addPlayer(@RequestBody IPLPlayer player ) {
		return service.addPlayer(player);
	}
	
	@GetMapping("/getallPlayer")
	public List<IPLPlayer> getallPlayer() {
		return service.getallPlayer();
	}
	
	@PutMapping("/updateplayer/{pid}")
	public String  updateplayerById(@PathVariable int pid) {
		return service.updateplayerById(pid);
	}
	
	@GetMapping("/getplayerById/{pid}")
	public IPLPlayer getplayerById(@PathVariable int pid) {
		IPLPlayer player=service.getplayerById(pid);
	    System.out.println(player);
		return player;
	 }
	
	
	@GetMapping("/getplayerWithStartName/{startwords}")
	public List<IPLPlayer> getPlayerStartName(@PathVariable String startwords){
		return service.getPlayerStartName(startwords);
	}
	
	@GetMapping("/getplayerWithEndName/{startwords}")
	public List<IPLPlayer> getPlayerEndName(@PathVariable String startwords){
		return service.getPlayerEndName(startwords);
	}
	
	@GetMapping("/get1kScorePlayer/{score}")
	public List<IPLPlayer> getPlayerScoreMore1k(@PathVariable int score) {
		return service.getPlayerScoreMore1k(score);
	}
	
	@GetMapping("/getWicketBetween100to200")
	public List<IPLPlayer> getWicket100to200(){
		return service.getWicket();
	}
	
    @GetMapping("/getSortedScorePlayer")
	public List<IPLPlayer> getSortedScorePlayer(){
		return service.getSortedScorePlayer();
	}
}

