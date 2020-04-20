package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 问题表
 * @author Administrator
 *
 */
public class Question implements Serializable{


	private static final long serialVersionUID = 2792824783925654408L;
	private int questionId;
	private String question; //问题描述
	private Date addTime;
	
	/**
	 * @return the questionId
	 */
	public int getQuestionId() {
		return questionId;
	}
	/**
	 * @param questionId the questionId to set
	 */
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	/**
	 * @return the question
	 */
	public String getQuestion() {
		return question;
	}
	/**
	 * @param question the question to set
	 */
	public void setQuestion(String question) {
		this.question = question;
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
