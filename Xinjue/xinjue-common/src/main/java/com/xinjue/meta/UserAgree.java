package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

public class UserAgree implements Serializable{

	private static final long serialVersionUID = 6745584919927677142L;
	private int agreeId;//点赞ID
	private int heartAnswerId;//点赞的评论Id
	private int praiseStatus;//点赞的状态
	private int agreeUserId;//被点赞的用户Id
	private int userId;//点赞的用户Id
	private Date addTime;//点赞时间
	private int praiseNum;//点赞的数量统计
	public int getAgreeId() {
		return agreeId;
	}
	public void setAgreeId(int agreeId) {
		this.agreeId = agreeId;
	}
	public int getHeartAnswerId() {
		return heartAnswerId;
	}
	public void setHeartAnswerId(int heartAnswerId) {
		this.heartAnswerId = heartAnswerId;
	}
	public int getPraiseStatus() {
		return praiseStatus;
	}
	public void setPraiseStatus(int praiseStatus) {
		this.praiseStatus = praiseStatus;
	}
	public int getAgreeUserId() {
		return agreeUserId;
	}
	public void setAgreeUserId(int agreeUserId) {
		this.agreeUserId = agreeUserId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public int getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(int praiseNum) {
		this.praiseNum = praiseNum;
	}
	
	
}
