package com.xinjue.meta.vo; 

import java.util.Date;
import java.util.List;

import com.xinjue.meta.EvaluationOption;

/** 
 * @author tqf
 * @version 创建时间：2019-12-11 下午4:31:18 
 * 类说明:测评试题数据
 */
public class SysEvaluationVo {
	
	private int questionId;//问题ID
	private String question; //问题描述
	private List<EvaluationOption> list; //选项数组
	
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

}
 