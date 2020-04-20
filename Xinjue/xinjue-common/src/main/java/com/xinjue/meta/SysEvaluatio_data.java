package com.xinjue.meta; 

import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2019-12-11 下午4:05:23 
 * 类说明:测评记录
 */
public class SysEvaluatio_data {
	
	private int evaluationDataId; 
	private int evaluationId; //测评ID
	private String evaluationTitle; //测评标题
	private String options; //用户的选项
	private String platform; //平台
	private String formNumber; //来源编号
	private String score; //测评分数
	private String province; //省份
	private String city; //城市
	private Date addTime; //添加时间
	
	/**
	 * @return the evaluationDataId
	 */
	public int getEvaluationDataId() {
		return evaluationDataId;
	}
	/**
	 * @param evaluationDataId the evaluationDataId to set
	 */
	public void setEvaluationDataId(int evaluationDataId) {
		this.evaluationDataId = evaluationDataId;
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
	 * @return the evaluationTitle
	 */
	public String getEvaluationTitle() {
		return evaluationTitle;
	}
	/**
	 * @param evaluationTitle the evaluationTitle to set
	 */
	public void setEvaluationTitle(String evaluationTitle) {
		this.evaluationTitle = evaluationTitle;
	}
	/**
	 * @return the options
	 */
	public String getOptions() {
		return options;
	}
	/**
	 * @param options the options to set
	 */
	public void setOptions(String options) {
		this.options = options;
	}
	/**
	 * @return the platform
	 */
	public String getPlatform() {
		return platform;
	}
	/**
	 * @param platform the platform to set
	 */
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	/**
	 * @return the formNumber
	 */
	public String getFormNumber() {
		return formNumber;
	}
	/**
	 * @param formNumber the formNumber to set
	 */
	public void setFormNumber(String formNumber) {
		this.formNumber = formNumber;
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
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
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
 