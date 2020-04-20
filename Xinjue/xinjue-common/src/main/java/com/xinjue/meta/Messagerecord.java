package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;
/**
 * 消息记录表
 * @author Administrator
 *
 */
public class Messagerecord implements Serializable{


	private static final long serialVersionUID = -2562229290676205281L;
	
	private int messagerecordId;
	//订单ID
	private int orderRecordId; 
	 //心理师ID
	private int therd_userId; 
	//用户ID
	private int userId;   
	//消息类型   0--预约成功   1---即将开始    2---预约取消
	private int type;  
	//用户  消息状态   0---未读   1---已读
	private int status; 
	//心理师  消息状态   0---未读   1---已读
	private int status_xls;
	//预约时间
	private Date appointmentTime;
	private Date addTime;
	private String orderNumber; //订单编号
	
	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}
	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	/**
	 * @return the status_xls
	 */
	public int getStatus_xls() {
		return status_xls;
	}
	/**
	 * @param status_xls the status_xls to set
	 */
	public void setStatus_xls(int status_xls) {
		this.status_xls = status_xls;
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
	 * @return the messagerecordId
	 */
	public int getMessagerecordId() {
		return messagerecordId;
	}
	/**
	 * @param messagerecordId the messagerecordId to set
	 */
	public void setMessagerecordId(int messagerecordId) {
		this.messagerecordId = messagerecordId;
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
	 * @return the therd_userId
	 */
	public int getTherd_userId() {
		return therd_userId;
	}
	/**
	 * @param therd_userId the therd_userId to set
	 */
	public void setTherd_userId(int therd_userId) {
		this.therd_userId = therd_userId;
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
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
	 * @return the appointmentTime
	 */
	public Date getAppointmentTime() {
		return appointmentTime;
	}
	/**
	 * @param appointmentTime the appointmentTime to set
	 */
	public void setAppointmentTime(Date appointmentTime) {
		this.appointmentTime = appointmentTime;
	}

}
