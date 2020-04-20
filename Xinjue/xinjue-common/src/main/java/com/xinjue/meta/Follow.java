package com.xinjue.meta; 

import java.io.Serializable;
import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2019-4-25 上午9:15:57 
 * 类说明  关注 粉丝表结构
 */
public class Follow implements Serializable{
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 8424356148562076314L;
	
	
	private int followId;
	private int userId; //用户ID
	private int fUserId; //关注的用户ID
	private Date addTime;
	
	public int getFollowId() {
		return followId;
	}
	public void setFollowId(int followId) {
		this.followId = followId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getfUserId() {
		return fUserId;
	}
	public void setfUserId(int fUserId) {
		this.fUserId = fUserId;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	} 
}
 