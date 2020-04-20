package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;
/**
 * banner图
 * @author tqf
 *
 */
public class Banner implements Serializable{

	private static final long serialVersionUID = -5860189719515287551L;
	
	private int bannerId;
	private String imageUrl; //图片地址
	private String linkUrl;  //链接地址
	private int number;      //排序
	private Date addTime;
	
	/**
	 * @return the bannerId
	 */
	public int getBannerId() {
		return bannerId;
	}
	/**
	 * @param bannerId the bannerId to set
	 */
	public void setBannerId(int bannerId) {
		this.bannerId = bannerId;
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
	 * @return the linkUrl
	 */
	public String getLinkUrl() {
		return linkUrl;
	}
	/**
	 * @param linkUrl the linkUrl to set
	 */
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}
	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
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
