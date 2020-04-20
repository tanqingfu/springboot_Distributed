package com.xinjue.meta;

import java.io.Serializable;

/**
 * 心态测评关联问题
 * @author Administrator
 *
 */
public class Evaluation_question implements Serializable{

	private static final long serialVersionUID = 6406726972637074278L;
	
	private int evaluationId; //测评ID
	private int questionId; //问题ID
	private int questionNmber; //问题序号
	
	/**
	 * @return the questionNmber
	 */
	public int getQuestionNmber() {
		return questionNmber;
	}
	/**
	 * @param questionNmber the questionNmber to set
	 */
	public void setQuestionNmber(int questionNmber) {
		this.questionNmber = questionNmber;
	}
	/**
	 * @return the evaluationId
	 */
	public int getEvaluationId() {
		return evaluationId;
	}
	/**
	 * @param evaluationId the evaluationId to set
	 */
	public void setEvaluationId(int evaluationId) {
		this.evaluationId = evaluationId;
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

}
