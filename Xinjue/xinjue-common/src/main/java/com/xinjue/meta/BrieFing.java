package com.xinjue.meta; 

import java.io.Serializable;
import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;


/** 
 * @author tqf
 * @version 创建时间：2019-9-6 上午10:53:46 
 * 类说明:简报表字段
 */
public class BrieFing implements Serializable{
	private Integer id;
	private String author; //编辑人
	private String content; //内容
	private Date addTime; //添加时间
	private Date updateTime; //修改时间
	
	private Date releaseTime;//设定的发布时间
	
	private Integer category;
	
//	@JSONField(serialize=false)
	private Lottery lottery;//开奖实体属性
	
	public Lottery getLottery() {
		return lottery;
	}
	public void setLottery(Lottery lottery) {
		this.lottery = lottery;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	
	public Date getReleaseTime() {
		return releaseTime;
	}
	public void setReleaseTime(Date releaseTime) {
		this.releaseTime = releaseTime;
	}
	public Integer getCategory() {
		return category;
	}
	public void setCategory(Integer category) {
		this.category = category;
	}
	
}
 