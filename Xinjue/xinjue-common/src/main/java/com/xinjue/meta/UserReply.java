package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

public class UserReply extends Users implements Serializable{

	private int replyId; //评论Id
	private String replyContent;//评论的内容
	private int replyUserId;//被评论的心理师Id
	private int userId;//评论的用户Id
	private int status;//评论的状态   0 为可展示   1为不可展示
	private Date addTime;//评论添加时间
	private int heartAnswerId;//心理师评价Id
	private int praiseNum;//点赞数量
	
	private int enable;//评论状态  0 显示  1 不显示  2 待审核
	
	
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public int getReplyUserId() {
		return replyUserId;
	}
	public void setReplyUserId(int replyUserId) {
		this.replyUserId = replyUserId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public int getheartAnswerId() {
		return heartAnswerId;
	}
	public void setheartAnswerId(int heartAnswerId) {
		this.heartAnswerId = heartAnswerId;
	}
	public int getPraiseNum() {
		return praiseNum;
	}
	public void setPraiseNum(int praiseNum) {
		this.praiseNum = praiseNum;
	}
	
	
}
