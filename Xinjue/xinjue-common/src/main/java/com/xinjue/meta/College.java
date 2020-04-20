package com.xinjue.meta; 

import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2019-9-6 上午11:10:38 
 * 类说明:彩票学院表字段
 */
public class College {
	
	private int id;
	private String title; //标题
	private int type; //类型 0--体彩  1 --福彩
	private String tags; //标签
	private String author; //编辑人
	private int isTop; //是否置顶  0--否  1--是
	private String content; //内容
	private Date addTime;
	private Date updateTime;
	private String summary; //摘要
	private String time; // 添加日期 用于页码展示使用
	
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getTags() {
		return tags;
	}
	public void setTags(String tags) {
		this.tags = tags;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsTop() {
		return isTop;
	}
	public void setIsTop(int isTop) {
		this.isTop = isTop;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
	
}
 