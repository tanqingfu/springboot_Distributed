package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

public class HeartPathBrowse implements Serializable{

	/**  
	 * @author:zwd
	 * @date:2019-7-8
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private long browseNum;//浏览量
	private Date addTime;
	private Date updateTime;
	
	public Date getAddTime() {
		return addTime;
	}
	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getBrowseNum() {
		return browseNum;
	}
	public void setBrowseNum(long browseNum) {
		this.browseNum = browseNum;
	}
	
	

}
