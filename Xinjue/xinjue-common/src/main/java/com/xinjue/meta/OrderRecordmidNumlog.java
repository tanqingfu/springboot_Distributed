package com.xinjue.meta;

import java.util.Date;
/**
 * 小号拨打日志记录表
 * @author Administrator
 *
 */
public class OrderRecordmidNumlog {
	
	private int orderRecordlogId;
	private int orderRecordId;
	private String mappingId; //绑定关系ID
	private String midNum; //小号号码
	private String message;
	private int status; //0--初始，1--已绑定 ，2---已解绑
	private Date addTime;
	private Date updateTime;
	private int call_duration;
	
	/**
	 * @return the call_duration
	 */
	public int getCall_duration() {
		return call_duration;
	}
	/**
	 * @param call_duration the call_duration to set
	 */
	public void setCall_duration(int call_duration) {
		this.call_duration = call_duration;
	}
	/**
	 * @return the midNum
	 */
	public String getMidNum() {
		return midNum;
	}
	/**
	 * @param midNum the midNum to set
	 */
	public void setMidNum(String midNum) {
		this.midNum = midNum;
	}
	/**
	 * @return the orderRecordId
	 */
	public int getOrderRecordId() {
		return orderRecordId;
	}
	/**
	 * @param orderRecordId the orderRecordId to set
	 */
	public void setOrderRecordId(int orderRecordId) {
		this.orderRecordId = orderRecordId;
	}
	/**
	 * @return the mappingId
	 */
	public String getMappingId() {
		return mappingId;
	}
	/**
	 * @param mappingId the mappingId to set
	 */
	public void setMappingId(String mappingId) {
		this.mappingId = mappingId;
	}
	/**
	 * @return the orderRecordlogId
	 */
	public int getOrderRecordlogId() {
		return orderRecordlogId;
	}
	/**
	 * @param orderRecordlogId the orderRecordlogId to set
	 */
	public void setOrderRecordlogId(int orderRecordlogId) {
		this.orderRecordlogId = orderRecordlogId;
	}
	
	
	
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
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
