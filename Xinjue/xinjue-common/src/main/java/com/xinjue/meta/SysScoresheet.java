package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;


/**
 * 权值对应解析结果表
 * @author Administrator
 *
 */
public class SysScoresheet implements Serializable{

	private static final long serialVersionUID = 1L;
	private int scoresheetId;
	private int evaluationId; //测评ID
	private int minscore; //小权值区间
	private int maxscore; //大权值区间
	private String result; //解析结果
	private Date addTime; //添加时间
	private int score; //权值
	private String title;
	
	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}
	/**
	 * @return the scoresheetId
	 */
	public int getScoresheetId() {
		return scoresheetId;
	}
	/**
	 * @param scoresheetId the scoresheetId to set
	 */
	public void setScoresheetId(int scoresheetId) {
		this.scoresheetId = scoresheetId;
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
	 * @return the minscore
	 */
	public int getMinscore() {
		return minscore;
	}
	/**
	 * @param minscore the minscore to set
	 */
	public void setMinscore(int minscore) {
		this.minscore = minscore;
	}
	/**
	 * @return the maxscore
	 */
	public int getMaxscore() {
		return maxscore;
	}
	/**
	 * @param maxscore the maxscore to set
	 */
	public void setMaxscore(int maxscore) {
		this.maxscore = maxscore;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
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
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
