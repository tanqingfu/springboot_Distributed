package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;
/**
 * 用户评价表
 * @author Administrator
 *
 */
public class Evaluate implements Serializable{


	private static final long serialVersionUID = 17956051460285345L;
	private int evaluateId;
	private int orderRecordId; //订单ID
	private int userId;  //用户ID
	private String content; //评价内容
	private int star; //评价星级
	private int status; //是否匿名   0—否     1—是
	private Date addTime;
	private Date updateTime;
	private int therd_userId; //心理师ID

	private String keyTags;

	
	
	/**
	 * @return the keyTags
	 */
	public String getKeyTags() {
		return keyTags;
	}
	/**
	 * @param keyTags the keyTags to set
	 */
	public void setKeyTags(String keyTags) {
		this.keyTags = keyTags;
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
	 * @return the evaluateId
	 */
	public int getEvaluateId() {
		return evaluateId;
	}
	/**
	 * @param evaluateId the evaluateId to set
	 */
	public void setEvaluateId(int evaluateId) {
		this.evaluateId = evaluateId;
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
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the star
	 */
	public int getStar() {
		return star;
	}
	/**
	 * @param star the star to set
	 */
	public void setStar(int star) {
		this.star = star;
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
