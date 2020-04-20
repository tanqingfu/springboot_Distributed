package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;
/**
 * 心理师回答记录
 * @author Administrator
 *
 */
public class HeartAnswer implements Serializable{


	private static final long serialVersionUID = 7990116885546624573L;
	private int heartAnswerId;
	private int heartPathId; //心路问题ID
	private int userId; //心理师用户ID
	private String content; //回答内容
	private Date addTime;
	private int evaluateNum;//其他心理师对评价的评论统计
	private int praiseNum;//点赞的数量统计
	 
	 
	public int getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(int praiseNum) {
		this.praiseNum = praiseNum;
	}
	public int getEvaluateNum() {
		return evaluateNum;
	}
	public void setEvaluateNum(int evaluateNum) {
		this.evaluateNum = evaluateNum;
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
