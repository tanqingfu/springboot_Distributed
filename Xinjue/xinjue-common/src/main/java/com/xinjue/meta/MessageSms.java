package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 短信记录
 * @author tqf
 *
 */
public class MessageSms implements Serializable{

	private static final long serialVersionUID = 2325331910948937202L;
	
	private int messageSmsId;
	private String code; //验证码
	private String smsContent; //短信内容
	private String mobile; //手机号
	private String smsSendStatus; //发送状态 成功 失败
	private Date addTime;
	/**
	 * @return the messageSmsId
	 */
	public int getMessageSmsId() {
		return messageSmsId;
	}
	/**
	 * @param messageSmsId the messageSmsId to set
	 */
	public void setMessageSmsId(int messageSmsId) {
		this.messageSmsId = messageSmsId;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * @return the smsContent
	 */
	public String getSmsContent() {
		return smsContent;
	}
	/**
	 * @param smsContent the smsContent to set
	 */
	public void setSmsContent(String smsContent) {
		this.smsContent = smsContent;
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
	/**
	 * @return the smsSendStatus
	 */
	public String getSmsSendStatus() {
		return smsSendStatus;
	}
	/**
	 * @param smsSendStatus the smsSendStatus to set
	 */
	public void setSmsSendStatus(String smsSendStatus) {
		this.smsSendStatus = smsSendStatus;
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
