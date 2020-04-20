package com.xinjue.meta;

import java.io.Serializable;

import javax.persistence.Table;

/**
 * 心态测评关联问题
 * @author Administrator
 *
 */
public class SysEvaluationQuestion implements Serializable{

	private static final long serialVersionUID = 1L;
	private int evaluation_questionId;
	private int evaluationId; //测评ID
	private int questionId; //问题ID
	private int questionNmber; //问题序号
	
	/**
	 * @return the evaluation_questionId
	 */
	public int getEvaluation_questionId() {
		return evaluation_questionId;
	}
	/**
	 * @param evaluation_questionId the evaluation_questionId to set
	 */
	public void setEvaluation_questionId(int evaluation_questionId) {
		this.evaluation_questionId = evaluation_questionId;
	}
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
