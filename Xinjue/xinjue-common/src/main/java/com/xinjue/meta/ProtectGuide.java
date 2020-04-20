package com.xinjue.meta; 

import java.io.Serializable;
import java.util.Date;

/**
 *  防护指南表字段
 * @author Administrator
 *
 */
public class ProtectGuide implements Serializable{
	
	private Integer pgId;
	private String title; //标题
	private Integer pgType; //类型  1 返岗上班  2 外出采购  3 就医相关  4  心理健康
	private String author; //编辑人
	private String content; //内容
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
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getPgId() {
		return pgId;
	}
	public void setPgId(int pgId) {
		this.pgId = pgId;
	}
	public int getPgType() {
		return pgType;
	}
	public void setPgType(int pgType) {
		this.pgType = pgType;
	}
	
	
	
}
 