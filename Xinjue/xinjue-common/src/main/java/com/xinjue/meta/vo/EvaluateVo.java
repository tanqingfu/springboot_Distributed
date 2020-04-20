package com.xinjue.meta.vo;

import java.io.Serializable;

import com.xinjue.meta.Evaluate;

public class EvaluateVo extends Evaluate implements Serializable{

	
	private static final long serialVersionUID = 3015025822055956987L;
	
	private String nickName; //用户名
	private String imageUrl; // 头像地址
	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
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

}
