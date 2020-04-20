package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

public class Repository  implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 3306115511792823385L;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.id
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private Integer id;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.title
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private String title;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.url
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private String url;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.type
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private Short type;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.isTop
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private Short isTop;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.author
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private String author;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.pv
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private Integer pv;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.addTime
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private Date addTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.updateTime
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private Date updateTime;

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column repository.content
	 * @mbggenerated  Thu Feb 27 16:05:42 CST 2020
	 */
	private String content;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the type
	 */
	public Short getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Short type) {
		this.type = type;
	}


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the pv
	 */
	public Integer getPv() {
		return pv;
	}

	/**
	 * @param pv the pv to set
	 */
	public void setPv(Integer pv) {
		this.pv = pv;
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
	 * @return the isTop
	 */
	public Short getIsTop() {
		return isTop;
	}

	/**
	 * @param isTop the isTop to set
	 */
	public void setIsTop(Short isTop) {
		this.isTop = isTop;
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