package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 测评记录
 * @author Administrator
 *
 */
public class EvaluationData implements Serializable{


	private static final long serialVersionUID = 5561674296549894525L;
	private int evaluationDataId;
	private int evaluationId; //测评ID
	private int userId; //用户ID
	private String options; //用户的选项  A,B,C
	private Date addTime;
	private int score;
	private String province;
	private String city;
	private String district;
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
	 * @return the evaluationDataIds
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
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the option
	 */
	public String getOptions() {
		return options;
	}
	/**
	 * @param option the option to set
	 */
	public void setOptions(String options) {
		this.options = options;
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
	 * @return the district
	 */
	public String getDistrict() {
		return district;
	}
	/**
	 * @param district the district to set
	 */
	public void setDistrict(String district) {
		this.district = district;
	}
	

}
