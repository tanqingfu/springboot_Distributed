package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Description 用户
 * @author 
 * @version 
 */
public class Users implements Serializable {
	
	private static final long serialVersionUID = 3313265767541363083L;
	
	private int userId;
	private String nickName;
	private String password;
	private int type; //0--用户，1--心理师
	private String imageUrl; // 头像地址
	private String mobile;  //手机号
	private String realName; //真实姓名
	private String sex; //性别
	private String province; //省
	private String city; // 市
	private String marriageStatus; //0--单身，1--恋爱，2--已婚，3--离异
	private String occupation; //职业
	private String resume; //简介
	private String lable;  //个人标签
	private Date addtime;
	private int star; // 星级  1 2 3 4 5 
	private String grade; // 心理师   彩票达人  国家二级心理师.....
	private int age; //年龄
	private String datebirth;
	private int numer;
	private String sessionId;
	private int total;  //未读消息统计
	private int cp_total; //测评记录统计
	private int updatenumer; //昵称修改次数
	
	private String wxOpenid; //微信第三方登录ID
	private String qqOpenid; //QQ第三方登录ID
	private int loginType;//标记第三方登录   2  为微信登录   1 为QQ登录   3为H5手机号注册
	private int callStatus; //0--初始 1--通话中
	private int fens; //粉丝数
	private int wend; //回答次数
	private int frozenStatus; //冻结状态  0--默认  1--已冻结
	private String ip;
	private int shows; // 0--展示  1--不展示
	private int helpNumber; //添加随机的帮助人数
	
	
	/**
	 * @return the helpNumber
	 */
	public int getHelpNumber() {
		return helpNumber;
	}
	/**
	 * @param helpNumber the helpNumber to set
	 */
	public void setHelpNumber(int helpNumber) {
		this.helpNumber = helpNumber;
	}
	/**
	 * @return the shows
	 */
	public int getShows() {
		return shows;
	}
	/**
	 * @param shows the shows to set
	 */
	public void setShows(int shows) {
		this.shows = shows;
	}
	/**
	 * @return the ip
	 */
	public String getIp() {
		return ip;
	}
	/**
	 * @param ip the ip to set
	 */
	public void setIp(String ip) {
		this.ip = ip;
	}
	public int getFrozenStatus() {
		return frozenStatus;
	}
	public void setFrozenStatus(int frozenStatus) {
		this.frozenStatus = frozenStatus;
	}
	public int getWend() {
		return wend;
	}
	public void setWend(int wend) {
		this.wend = wend;
	}
	public int getFens() {
		return fens;
	}
	public void setFens(int fens) {
		this.fens = fens;
	}
	public int getCallStatus() {
		return callStatus;
	}
	public void setCallStatus(int callStatus) {
		this.callStatus = callStatus;
	}
	public String getWxOpenid() {
		return wxOpenid;
	}
	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}
	public String getQqOpenid() {
		return qqOpenid;
	}
	public void setQqOpenid(String qqOpenid) {
		this.qqOpenid = qqOpenid;
	}
	public int getLoginType() {
		return loginType;
	}
	public void setLoginType(int loginType) {
		this.loginType = loginType;
	}

	/**
	 * @return the updatenumer
	 */
	public int getUpdatenumer() {
		return updatenumer;
	}
	/**
	 * @param updatenumer the updatenumer to set
	 */
	public void setUpdatenumer(int updatenumer) {
		this.updatenumer = updatenumer;
	}
	/**
	 * @return the cp_total
	 */
	public int getCp_total() {
		return cp_total;
	}
	/**
	 * @param cp_total the cp_total to set
	 */
	public void setCp_total(int cp_total) {
		this.cp_total = cp_total;
	}
	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}
	/**
	 * @param total the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public int getNumer() {
		return numer;
	}
	public void setNumer(int numer) {
		this.numer = numer;
	}
	/**
	 * @return the datebirth
	 */
	public String getDatebirth() {
		return datebirth;
	}
	/**
	 * @param datebirth the datebirth to set
	 */
	public void setDatebirth(String datebirth) {
		this.datebirth = datebirth;
	}
	private int helpCount; //帮助过多少人
	private String msg;
	private Date loginTime;
	
	/**
	 * @return the loginTime
	 */
	public Date getLoginTime() {
		return loginTime;
	}
	/**
	 * @param loginTime the loginTime to set
	 */
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}
	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}
	/**
	 * @return the helpCount
	 */
	public int getHelpCount() {
		return helpCount;
	}
	/**
	 * @param helpCount the helpCount to set
	 */
	public void setHelpCount(int helpCount) {
		this.helpCount = helpCount;
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
	 * @return the grade
	 */
	public String getGrade() {
		return grade;
	}
	/**
	 * @param grade the grade to set
	 */
	public void setGrade(String grade) {
		this.grade = grade;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}
	/**
	 * @param imageUrl the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
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
	 * @return the realName
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * @param realName the realName to set
	 */
	public void setRealName(String realName) {
		this.realName = realName;
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
	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province the province to set
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the marriageStatus
	 */
	public String getMarriageStatus() {
		return marriageStatus;
	}
	/**
	 * @param marriageStatus the marriageStatus to set
	 */
	public void setMarriageStatus(String marriageStatus) {
		this.marriageStatus = marriageStatus;
	}
	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}
	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}
	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}
	/**
	 * @return the lable
	 */
	public String getLable() {
		return lable;
	}
	/**
	 * @param lable the lable to set
	 */
	public void setLable(String lable) {
		this.lable = lable;
	}
	/**
	 * @return the addtime
	 */
	public Date getAddtime() {
		return addtime;
	}
	/**
	 * @param addtime the addtime to set
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
}
