package com.xinjue.meta; 

import java.io.Serializable;
import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2020-3-20 上午9:12:44 
 * 类说明:测评分类实体
 */
public class Evaluation_cate implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6664536036393479883L;
	private int id;
	private String title; //分类标题
	private int status; //是否展示： 0 显示，1不显示
	private int numer;  //数字排序  升序
	private String imageUrl; //icon图片地址
	private Date addTime;
	private Date updateTime;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	public int getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(int status) {
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
	 * @return the updateTime
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
	/**
	 * @param updateTime the updateTime to set
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
 