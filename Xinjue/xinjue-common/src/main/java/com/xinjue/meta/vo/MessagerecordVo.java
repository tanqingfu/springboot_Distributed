package com.xinjue.meta.vo;

import java.util.Date;

import com.xinjue.meta.Messagerecord;

public class MessagerecordVo extends Messagerecord{

	
	private static final long serialVersionUID = -5206982375917243256L;
	
	private String nickName;
	private int age; //年龄
	private String sex; //性别
	private String str_endtime; //预约时间展示使用
	private String jl_time; //距离时间
	private Date updateTime; //订单更新时间
	private Date time; //创建时间
	private int dd_status;//订单状态
	/**
	 * @return the dd_status
	 */
	public int getDd_status() {
		return dd_status;
	}
	/**
	 * @param dd_status the dd_status to set
	 */
	public void setDd_status(int dd_status) {
		this.dd_status = dd_status;
	}
	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(Date time) {
		this.time = time;
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
	/**
	 * @return the jl_time
	 */
	public String getJl_time() {
		return jl_time;
	}
	/**
	 * @param jl_time the jl_time to set
	 */
	public void setJl_time(String jl_time) {
		this.jl_time = jl_time;
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

}
