package com.xinjue.meta;

import java.util.Date;
/**
 * 登录日志
 * @author Administrator
 *
 */
public class LogingLog {
     
	private int logingId;
	private int usersId;
	private Date addTime;
	private String ip;
	
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	/**
	 * @return the logingId
	 */
	public int getLogingId() {
		return logingId;
	}
	/**
	 * @param logingId the logingId to set
	 */
	public void setLogingId(int logingId) {
		this.logingId = logingId;
	}
	/**
	 * @return the usersId
	 */
	public int getUsersId() {
		return usersId;
	}
	/**
	 * @param usersId the usersId to set
	 */
	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}
	/**
	 * @return the addTime
	 */
	public Date getAddTime() {
		return addTime;
	}
	/**
	 * @param addTime the addTime to set
	 */
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
}
