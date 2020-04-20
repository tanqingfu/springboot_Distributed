package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 测评表
 * @author Administrator
 *
 */
public class Evaluation implements Serializable{


	private static final long serialVersionUID = -6834217454621058937L;
	
	private int evaluationId;
	private String title; //标题
	private String status; //状态 ，0 显示，1不显示
	private int numer;//数字排序
	private String imageUrl;
	private String profiles;//简介
	private int evaluationNumer;//测评人数
	private Date addTime;
	private int total_tm; //多少题
	private int evaluationSortId; //测评模块id
	private int evaluationCateId;//测评分类ID
	
	/**
	 * @return the evaluationCateId
	 */
	public int getEvaluationCateId() {
		return evaluationCateId;
	}
	/**
	 * @param evaluationCateId the evaluationCateId to set
	 */
	public void setEvaluationCateId(int evaluationCateId) {
		this.evaluationCateId = evaluationCateId;
	}
	/**
	 * @return the evaluationSortId
	 */
	public int getEvaluationSortId() {
		return evaluationSortId;
	}
	/**
	 * @param evaluationSortId the evaluationSortId to set
	 */
	public void setEvaluationSortId(int evaluationSortId) {
		this.evaluationSortId = evaluationSortId;
	}
	/**
	 * @return the total_tm
	 */
	public int getTotal_tm() {
		return total_tm;
	}
	/**
	 * @param total_tm the total_tm to set
	 */
	public void setTotal_tm(int total_tm) {
		this.total_tm = total_tm;
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
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the numer
	 */
	public int getNumer() {
		return numer;
	}
	/**
	 * @param numer the numer to set
	 */
	public void setNumer(int numer) {
		this.numer = numer;
	}
	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	/**
	 * @return the profiles
	 */
	public String getProfiles() {
		return profiles;
	}
	/**
	 * @param profiles the profiles to set
	 */
	public void setProfiles(String profiles) {
		this.profiles = profiles;
	}
	/**
	 * @return the evaluationNumer
	 */
	public int getEvaluationNumer() {
		return evaluationNumer;
	}
	/**
	 * @param evaluationNumer the evaluationNumer to set
	 */
	public void setEvaluationNumer(int evaluationNumer) {
		this.evaluationNumer = evaluationNumer;
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
