package com.xinjue.meta; 

import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2019-3-18 下午2:37:53 
 * 类说明   报告
 */
public class usersReport {
	
	private int reportId;
	private int orderRecordId; //订单ID
	private int userId; //用户ID
	private int threadUserId;  //心理师ID
	private int attitudeStar; //态度星级
	private int moodStar; //情绪星级
	private int communicateStar;  //沟通星级
	private String problemDetail; //问题描述
	private String communications; //沟通过程描述
	private String results;  //处理结果描述
	private String fileName; //上传文件测试
	private Date addTime; //添加时间
	
	/**
	 * @return the reportId
	 */
	public int getReportId() {
		return reportId;
	}
	/**
	 * @param reportId the reportId to set
	 */
	public void setReportId(int reportId) {
		this.reportId = reportId;
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
	 * @return the threadUserId
	 */
	public int getThreadUserId() {
		return threadUserId;
	}
	/**
	 * @param threadUserId the threadUserId to set
	 */
	public void setThreadUserId(int threadUserId) {
		this.threadUserId = threadUserId;
	}
	/**
	 * @return the attitudeStar
	 */
	public int getAttitudeStar() {
		return attitudeStar;
	}
	/**
	 * @param attitudeStar the attitudeStar to set
	 */
	public void setAttitudeStar(int attitudeStar) {
		this.attitudeStar = attitudeStar;
	}
	/**
	 * @return the moodStar
	 */
	public int getMoodStar() {
		return moodStar;
	}
	/**
	 * @param moodStar the moodStar to set
	 */
	public void setMoodStar(int moodStar) {
		this.moodStar = moodStar;
	}
	/**
	 * @return the communicateStar
	 */
	public int getCommunicateStar() {
		return communicateStar;
	}
	/**
	 * @param communicateStar the communicateStar to set
	 */
	public void setCommunicateStar(int communicateStar) {
		this.communicateStar = communicateStar;
	}
	/**
	 * @return the problemDetail
	 */
	public String getProblemDetail() {
		return problemDetail;
	}
	/**
	 * @param problemDetail the problemDetail to set
	 */
	public void setProblemDetail(String problemDetail) {
		this.problemDetail = problemDetail;
	}
	/**
	 * @return the communications
	 */
	public String getCommunications() {
		return communications;
	}
	/**
	 * @param communications the communications to set
	 */
	public void setCommunications(String communications) {
		this.communications = communications;
	}
	/**
	 * @return the results
	 */
	public String getResults() {
		return results;
	}
	/**
	 * @param results the results to set
	 */
	public void setResults(String results) {
		this.results = results;
	}
	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}
	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
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
 