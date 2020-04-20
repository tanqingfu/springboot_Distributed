package com.xinjue.meta.vo;

import java.io.Serializable;
import java.util.Date;

import com.xinjue.meta.HeartAnswer;
import com.xinjue.meta.Users;

public class UsersHeartPathVo extends Users implements Serializable{
private static final long serialVersionUID = -1977468798955856729L;
	
	private int heartPathId;
	private int userId;
	private String title; //标题
	private String content; //内容
	private String types; //心路类型 0--彩票类 、1--心理咨询
	private Date addTime;
	
	private int sayNums;//回答人数
	private int numDays;//回答几天前
	private int clickHit;//点击量  阅读量
	private int replyHit;//回复
	
	
	
	public int getReplyHit() {
		return replyHit;
	}
	public void setReplyHit(int replyHit) {
		this.replyHit = replyHit;
	}
	public int getNumDays() {
		return numDays;
	}
	public void setNumDays(int numDays) {
		this.numDays = numDays;
	}
	public int getClickHit() {
		return clickHit;
	}
	public void setClickHit(int clickHit) {
		this.clickHit = clickHit;
	}
	
	public int getSayNums() {
		return sayNums;
	}
	public void setSayNums(int sayNums) {
		this.sayNums = sayNums;
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
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
	 * @return the types
	 */
	public String getTypes() {
		return types;
	}
	/**
	 * @param types the types to set
	 */
	public void setTypes(String types) {
		this.types = types;
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
