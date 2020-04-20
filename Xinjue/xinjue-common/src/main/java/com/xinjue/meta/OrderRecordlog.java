package com.xinjue.meta;

import java.util.Date;

public class OrderRecordlog {
	
	private int orderRecordlogId;
	private int orderRecordId; //订单ID
	private String message; //详细信息
	private Date addTime;
	private String actionID;
	private int call_duration;
	private int status;
	private Date dialTime;
	private Date endTime;
	private String h_m_s;
	
	
	public String getH_m_s() {
		return h_m_s;
	}
	public void setH_m_s(String h_m_s) {
		this.h_m_s = h_m_s;
	}
	public Date getDialTime() {
		return dialTime;
	}
	public void setDialTime(Date dialTime) {
		this.dialTime = dialTime;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
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
	 * @return the actionID
	 */
	public String getActionID() {
		return actionID;
	}
	/**
	 * @param actionID the actionID to set
	 */
	public void setActionID(String actionID) {
		this.actionID = actionID;
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
