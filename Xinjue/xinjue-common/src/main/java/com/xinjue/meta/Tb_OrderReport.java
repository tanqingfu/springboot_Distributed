package com.xinjue.meta; 

import java.math.BigDecimal;
import java.util.Date;

/** 
 * @author tqf
 * @version 创建时间：2020-1-2 下午2:04:50 
 * 类说明:购买报告订单
 */
public class Tb_OrderReport {
	
	private int id;
	private int userId;//用户ID
	private String out_trade_no; //订单编号
	private int from; //来源  0--H5  1--小程序
	private String title; //购买的标题
	private int type; // 购买类型   0--精简版   1--专业版
	private Double total_fee; //支付金额
	private int paytype; //支付类型  0--微信  1--支付宝
	private Date addTime;
	private int status; //0--未支付  1--已支付 2--订单关闭(用户未支付)
	private Date time_end; //支付完成时间
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the out_trade_no
	 */
	public String getOut_trade_no() {
		return out_trade_no;
	}
	/**
	 * @param out_trade_no the out_trade_no to set
	 */
	public void setOut_trade_no(String out_trade_no) {
		this.out_trade_no = out_trade_no;
	}
	/**
	 * @return the from
	 */
	public int getFrom() {
		return from;
	}
	/**
	 * @param from the from to set
	 */
	public void setFrom(int from) {
		this.from = from;
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
	 * @return the type
	 */
	public int getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}
	/**
	 * @return the total_fee
	 */
	public Double getTotal_fee() {
		return total_fee;
	}
	/**
	 * @param total_fee the total_fee to set
	 */
	public void setTotal_fee(Double total_fee) {
		this.total_fee = total_fee;
	}
	/**
	 * @return the paytype
	 */
	public int getPaytype() {
		return paytype;
	}
	/**
	 * @param paytype the paytype to set
	 */
	public void setPaytype(int paytype) {
		this.paytype = paytype;
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
	 * @return the time_end
	 */
	public Date getTime_end() {
		return time_end;
	}
	/**
	 * @param time_end the time_end to set
	 */
	public void setTime_end(Date time_end) {
		this.time_end = time_end;
	}
}
 