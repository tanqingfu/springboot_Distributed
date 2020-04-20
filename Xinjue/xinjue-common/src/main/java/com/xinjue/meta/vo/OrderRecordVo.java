package com.xinjue.meta.vo;


import java.io.Serializable;
import java.util.Date;


import com.xinjue.meta.OrderRecord;
import com.xinjue.meta.Users;



public class OrderRecordVo extends OrderRecord implements Serializable{


	private static final long serialVersionUID = -3840476993474206787L;
	private int orderRecordId;
	private int therd_userId; //心理师ID
	private int userId; //用户ID
	private String orderNumber; //订单号
//	private String type; //咨询类型
	private String status; //订单状态
	private String remarks; //用户留言
	private Date appointmentTime; //预约时间
	private Date addTime;//添加时间
	private Date endTime;//结束时间
	private String mobile;
	private String str_endtime;
	private String sex;
	private int age;
	private int report; //报告是否填写
	
	/**
	 * @return the report
	 */
	public int getReport() {
		return report;
	}
	/**
	 * @param report the report to set
	 */
	public void setReport(int report) {
		this.report = report;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the str_endtime
	 */
	public String getStr_endtime() {
		return str_endtime;
	}
	/**
	 * @param str_endtime the str_endtime to set
	 */
	public void setStr_endtime(String str_endtime) {
		this.str_endtime = str_endtime;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
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
	 * @return the type
	 */
//	public String getType() {
//		return type;
//	}
	/**
	 * @param type the type to set
	 */
//	public void setType(String type) {
//		this.type = type;
//	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}
	/**
	 * @param remarks the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
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
	
	private String nickName;
	private String imageUrl; // 头像地址
	private String grade; // 心理师   彩票达人  国家二级心理师.....
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
	/**
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
