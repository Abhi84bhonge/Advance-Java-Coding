package com.IPL.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class IPLPlayer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int pid;
	private String pName;
	private String tName;
	private int ingPlayed;
	private int numberCatches;
    private  int score;
    private int wickets;
	public IPLPlayer() {
		super();
	}
	public IPLPlayer(int pid, String pName, String tName, int ingPlayed, int numberCatches, int score, int wickets) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.tName = tName;
		this.ingPlayed = ingPlayed;
		this.numberCatches = numberCatches;
		this.score = score;
		this.wickets = wickets;
	}
	@Override
	public String toString() {
		return "IPLPlayer [pid=" + pid + ", pName=" + pName + ", tName=" + tName + ", ingPlayed=" + ingPlayed
				+ ", numberCatches=" + numberCatches + ", score=" + score + ", wickets=" + wickets + "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String gettName() {
		return tName;
	}
	public void settName(String tName) {
		this.tName = tName;
	}
	public int getIngPlayed() {
		return ingPlayed;
	}
	public void setIngPlayed(int ingPlayed) {
		this.ingPlayed = ingPlayed;
	}
	public int getNumberCatches() {
		return numberCatches;
	}
	public void setNumberCatches(int numberCatches) {
		this.numberCatches = numberCatches;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
    
    
}
