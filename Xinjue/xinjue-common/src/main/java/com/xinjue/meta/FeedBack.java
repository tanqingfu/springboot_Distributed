package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;
/**
 * 反馈信息
 * @author tqf
 *
 */
public class FeedBack implements Serializable{

	private static final long serialVersionUID = 956506947085138449L;
	
	private int feedBackId;
	private int userId; //用户ID
	private String content;//反馈内容
	private Date addTime;
	
	/**
	 * @return the feedBackId
	 */
	public int getFeedBackId() {
		return feedBackId;
	}
	/**
	 * @param feedBackId the feedBackId to set
	 */
	public void setFeedBackId(int feedBackId) {
		this.feedBackId = feedBackId;
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
