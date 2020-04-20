package com.xinjue.meta; 

import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2019-12-11 下午4:14:36 
 * 类说明:生成二维码图片记录
 */
public class SysQrcode {
	
	private int qrId;
	private int evalId; //测评ID
	private String imgurl; //图片地址
	private String qrName; //图片编号
	private Date addTime;
	
	/**
	 * @return the qrId
	 */
	public int getQrId() {
		return qrId;
	}
	/**
	 * @param qrId the qrId to set
	 */
	public void setQrId(int qrId) {
		this.qrId = qrId;
	}
	/**
	 * @return the evalId
	 */
	public int getEvalId() {
		return evalId;
	}
	/**
	 * @param evalId the evalId to set
	 */
	public void setEvalId(int evalId) {
		this.evalId = evalId;
	}
	/**
	 * @return the imgurl
	 */
	public String getImgurl() {
		return imgurl;
	}
	/**
	 * @param imgurl the imgurl to set
	 */
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	/**
	 * @return the qrName
	 */
	public String getQrName() {
		return qrName;
	}
	/**
	 * @param qrName the qrName to set
	 */
	public void setQrName(String qrName) {
		this.qrName = qrName;
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
 