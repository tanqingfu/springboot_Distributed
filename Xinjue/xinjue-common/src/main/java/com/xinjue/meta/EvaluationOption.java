package com.xinjue.meta;

import java.util.Date;

/**
 * 问题对应的选项表
 * @author Administrator
 *
 */
public class EvaluationOption {
	
	private int evaluationOptionId;
	private int questionId; //问题ID
	private String optionContent; //选项内容
	private int optionNumber; //选项序号,0,1,2...
	private String score; //权值
	private Date addTime;
	/**
	 * @return the evaluationOptionId
	 */
	public int getEvaluationOptionId() {
		return evaluationOptionId;
	}
	/**
	 * @param evaluationOptionId the evaluationOptionId to set
	 */
	public void setEvaluationOptionId(int evaluationOptionId) {
		this.evaluationOptionId = evaluationOptionId;
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
	 * @return the optionContent
	 */
	public String getOptionContent() {
		return optionContent;
	}
	/**
	 * @param optionContent the optionContent to set
	 */
	public void setOptionContent(String optionContent) {
		this.optionContent = optionContent;
	}
	/**
	 * @return the optionNumber
	 */
	public int getOptionNumber() {
		return optionNumber;
	}
	/**
	 * @param optionNumber the optionNumber to set
	 */
	public void setOptionNumber(int optionNumber) {
		this.optionNumber = optionNumber;
	}
	/**
	 * @return the score
	 */
	public String getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(String score) {
		this.score = score;
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
