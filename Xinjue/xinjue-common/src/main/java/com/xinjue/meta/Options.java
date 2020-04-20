package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 选项表
 * @author Administrator
 *
 */
public class Options implements Serializable{


	private static final long serialVersionUID = 183166177349300078L;
	private int optionId;
	private int questionId; //问题ID
	private int OptionNumber; //问题序号
	private String OptionTitle; //问题描述
	private String OptionResult; //问题对应的解答
	private String score; //权值
	private Date addTime;
	
	/**
	 * @return the optionId
	 */
	public int getOptionId() {
		return optionId;
	}
	/**
	 * @param optionId the optionId to set
	 */
	public void setOptionId(int optionId) {
		this.optionId = optionId;
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
	 * @return the optionNumber
	 */
	public int getOptionNumber() {
		return OptionNumber;
	}
	/**
	 * @param optionNumber the optionNumber to set
	 */
	public void setOptionNumber(int optionNumber) {
		OptionNumber = optionNumber;
	}
	/**
	 * @return the optionTitle
	 */
	public String getOptionTitle() {
		return OptionTitle;
	}
	/**
	 * @param optionTitle the optionTitle to set
	 */
	public void setOptionTitle(String optionTitle) {
		OptionTitle = optionTitle;
	}
	/**
	 * @return the optionResult
	 */
	public String getOptionResult() {
		return OptionResult;
	}
	/**
	 * @param optionResult the optionResult to set
	 */
	public void setOptionResult(String optionResult) {
		OptionResult = optionResult;
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
