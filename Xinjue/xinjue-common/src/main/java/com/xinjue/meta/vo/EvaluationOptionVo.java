package com.xinjue.meta.vo;

import java.util.Date;
import java.util.List;

import com.xinjue.meta.EvaluationOption;



public class EvaluationOptionVo{
	private Date addTime;
	private int questionId;
	private String question; //问题描述
	private List<EvaluationOption> list;
	
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
	/**
	 * @return the list
	 */
	public List<EvaluationOption> getList() {
		return list;
	}
	/**
	 * @param list the list to set
	 */
	public void setList(List<EvaluationOption> list) {
		this.list = list;
	}
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
	
}
