package com.xinjue.meta.vo;

import java.sql.Date;

import com.xinjue.meta.EvaluationData;
/**
 * 测评记录页面数据使用
 * @author Administrator
 *
 */
public class EvaluationDataVo extends EvaluationData{

	private static final long serialVersionUID = 2405270729007905025L;
	
	private String title; //测评标题
	private String imageUrl;
	private String profiles;//简介
	private String title_;//解析结果标题
	private String result; //解析结果
	
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
	private Date addTime_;
	
	public Date getAddTime_() {
		return addTime_;
	}
	public void setAddTime_(Date addTime_) {
		this.addTime_ = addTime_;
	}
	/**
	 * @return the title_
	 */
	public String getTitle_() {
		return title_;
	}
	/**
	 * @param title_ the title_ to set
	 */
	public void setTitle_(String title_) {
		this.title_ = title_;
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
}
