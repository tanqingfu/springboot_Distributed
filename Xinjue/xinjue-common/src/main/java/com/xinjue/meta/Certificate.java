package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 心理师 资质证书表
 * @author Administrator
 *
 */
public class Certificate implements Serializable{


	private static final long serialVersionUID = -2708442036981066714L;
	
	private int certificateId;
	private int userId; //用户ID
	private String imageUrl;//图片地址
	private Date addTime;
	
	/**
	 * @return the certificateId
	 */
	public int getCertificateId() {
		return certificateId;
	}
	/**
	 * @param certificateId the certificateId to set
	 */
	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
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

}
