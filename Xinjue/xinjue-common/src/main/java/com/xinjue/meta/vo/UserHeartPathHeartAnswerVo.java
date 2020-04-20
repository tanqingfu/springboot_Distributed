package com.xinjue.meta.vo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xinjue.meta.UserAgree;
import com.xinjue.meta.UserReply;
import com.xinjue.meta.Users;

/**
 * 心路详情页面下的心理师(users+HeartAnswer)
 * @author Administrator
 *
 */
public class UserHeartPathHeartAnswerVo extends Users implements Serializable{
	private static final long serialVersionUID = -5544578921834794260L;
	private int heartAnswerId;
	private int heartPathId; //心路问题ID
	private int userId; //心理师用户ID
	private String content; //回答内容
	private Date addTime;
	
	private int praiseStatus;//存放点赞状态
	private int praiseNum;//点赞数量
	private int helpUserId;//点赞的用户iD
	private int heartPathUserId;//当前登录用户写的心路才能出现回复按钮
	
	
	public int getHeartPathUserId() {
		return heartPathUserId;
	}
	public void setHeartPathUserId(int heartPathUserId) {
		this.heartPathUserId = heartPathUserId;
	}
	public int getHelpUserId() {
		return helpUserId;
	}
	public void setHelpUserId(int helpUserId) {
		this.helpUserId = helpUserId;
	}
	public int getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(int praiseNum) {
		this.praiseNum = praiseNum;
	}
	private int countNums;//统计有多少人回答
	
	private List<String> nickNames  = new ArrayList<String>();//存放查找的用户名
	
	private List<UserReply> userReply = new ArrayList<UserReply>();//存放评价详情

	public List<UserReply> getUserReply() {
		return userReply;
	}
	public void setUserReply(List<UserReply> userReply) {
		this.userReply = userReply;
	}
	
	public int getPraiseStatus() {
		return praiseStatus;
	}
	public void setPraiseStatus(int praiseStatus) {
		this.praiseStatus = praiseStatus;
	}
	public List<String> getNickNames() {
		return nickNames;
	}
	public void setNickNames(List<String> nickNames) {
		this.nickNames = nickNames;
	}
	public int getCountNums() {
		return countNums;
	}
	public void setCountNums(int countNums) {
		this.countNums = countNums;
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
