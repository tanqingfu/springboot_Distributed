package com.xinjue.meta; 

import java.util.Date;


/** 
 * @author tqf
 * @version 创建时间：2019-9-6 下午4:10:21 
 * 类说明: 开奖信息表
 */
public class Lottery {
	
	private int id;
	private String lotId;//彩种ID 100--双色球  200--大乐透
	private String termNo; //期次
	private String title; //彩种类型标题
	private String openNum;//开奖号码
	private String betAmount;// 投注量
	private String prizePoll; //奖池
	private Date openTime;//开奖时间
	private String week;//开奖时间对应的周几
	private Date addTime;
	private Date updateTime;
	
	private String monDays;//开奖时间的简化  09-08
	
	
	
	public String getMonDays() {
		return monDays;
	}
	public void setMonDays(String monDays) {
		this.monDays = monDays;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLotId() {
		return lotId;
	}
	public void setLotId(String lotId) {
		this.lotId = lotId;
	}
	public String getTermNo() {
		return termNo;
	}
	public void setTermNo(String termNo) {
		this.termNo = termNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOpenNum() {
		return openNum;
	}
	public void setOpenNum(String openNum) {
		this.openNum = openNum;
	}
	public String getBetAmount() {
		return betAmount;
	}
	public void setBetAmount(String betAmount) {
		this.betAmount = betAmount;
	}
	public String getPrizePoll() {
		return prizePoll;
	}
	public void setPrizePoll(String prizePoll) {
		this.prizePoll = prizePoll;
	}
	public Date getOpenTime() {
		return openTime;
	}
	public void setOpenTime(Date openTime) {
		this.openTime = openTime;
	}
	public String getWeek() {
		return week;
	}
	public void setWeek(String week) {
		this.week = week;
	}
}
 