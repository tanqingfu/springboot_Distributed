package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 心理师设置的可预约时间
 * @author Administrator
 *
 */
public class Appointment implements Serializable{

	private static final long serialVersionUID = -7671167405469914956L;
	
	private int appointmentId;
	private int userId; //心理师Id
	private Date dateTime; //预约的日期   2018-10-10
	private String dataTimeStatus; //可预约的时间段   0,1,0,1,0,1,0,1    0---可预约    1---不可预约
	private Date addTime;
	private Date updateTiem;
	
	/**
	 * @return the appointmentId
	 */
	public int getAppointmentId() {
		return appointmentId;
	}
	/**
	 * @param appointmentId the appointmentId to set
	 */
	public void setAppointmentId(int appointmentId) {
		this.appointmentId = appointmentId;
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
	 * @return the dateTime
	 */
	public Date getDateTime() {
		return dateTime;
	}
	/**
	 * @param dateTime the dateTime to set
	 */
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	/**
	 * @return the dataTimeStatus
	 */
	public String getDataTimeStatus() {
		return dataTimeStatus;
	}
	/**
	 * @param dataTimeStatus the dataTimeStatus to set
	 */
	public void setDataTimeStatus(String dataTimeStatus) {
		this.dataTimeStatus = dataTimeStatus;
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
	 * @return the updateTiem
	 */
	public Date getUpdateTiem() {
		return updateTiem;
	}
	/**
	 * @param updateTiem the updateTiem to set
	 */
	public void setUpdateTiem(Date updateTiem) {
		this.updateTiem = updateTiem;
	}

}
