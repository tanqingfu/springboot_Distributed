package com.xinjue.meta.vo;

import java.io.Serializable;
import java.util.Date;

import com.xinjue.meta.UsersHeartPath;

public class HeartPathAnswerVO extends UsersHeartPath implements Serializable{
	
	private static final long serialVersionUID = -5544578921834794260L;
	private int heartAnswerId;
	private int heartPathId; //心路问题ID
	private int userId; //心理师用户ID
	private String content; //回答内容
	private Date addTime;
	
	private int  numDays;//几天前
	private int  sayNums;//几人说
	
	public int getNumDays() {
		return numDays;
	}
	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
	/**
	 * @return the heartAnswerId
	 */
	public int getHeartAnswerId() {
		return heartAnswerId;
	}
	/**
	 * @param heartAnswerId the heartAnswerId to set
	 */
	public void setHeartAnswerId(int heartAnswerId) {
		this.heartAnswerId = heartAnswerId;
	}
	/**
	 * @return the heartPathId
	 */
	public int getHeartPathId() {
		return heartPathId;
	}
	/**
	 * @param heartPathId the heartPathId to set
	 */
	public void setHeartPathId(int heartPathId) {
		this.heartPathId = heartPathId;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
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
