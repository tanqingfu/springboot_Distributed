package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;




/**  添加测评问卷
 * @author:zwd
 * @date:2019-12-11
 */

public class SysEvaluation implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long evalId;
	private String title; //标题
	private String remarks;//备注
	private int evalNumer;//测评人数
	private int number;//二维码递增编号
	private String editor;//编辑者
	private String province;//省
	private int category;//分类
	private String city;//城市
	private String evaluationSortName;
	private Date addTime;
	private Date updateTime;
	/**
	 * @return the category
	 */
	public int getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(int category) {
		this.category = category;
	}
	public Long getEvalId() {
		return evalId;
	}
	public void setEvalId(Long evalId) {
		this.evalId = evalId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getEvalNumer() {
		return evalNumer;
	}
	public void setEvalNumer(int evalNumer) {
		this.evalNumer = evalNumer;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getEditor() {
		return editor;
	}
	public void setEditor(String editor) {
		this.editor = editor;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEvaluationSortName() {
		return evaluationSortName;
	}
	public void setEvaluationSortName(String evaluationSortName) {
		this.evaluationSortName = evaluationSortName;
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
	
	
	

}
