package com.xinjue.meta;

import java.io.Serializable;
import java.util.Date;
/**
 * 责任彩票   彩票案例
 * @author tqf
 *
 */
public class Content implements Serializable{

	private static final long serialVersionUID = -2720634112204083836L;
	
	private int contentId;
	private String title;  //标题
	private String type;  //0--责任彩票，1--成功案例
	private String istop;  //是否置顶，0--未置顶，1--置顶
	private String imageUrl;  //图片地址
	private String content;    //内容
	private int readingNumer; //阅读量
	private Date addTime;
	private Date updateTime;
	
	/**
	 * @return the contentId
	 */
	public int getContentId() {
		return contentId;
	}
	/**
	 * @param contentId the contentId to set
	 */
	public void setContentId(int contentId) {
		this.contentId = contentId;
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
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the istop
	 */
	public String getIstop() {
		return istop;
	}
	/**
	 * @param istop the istop to set
	 */
	public void setIstop(String istop) {
		this.istop = istop;
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
	 * @return the readingNumer
	 */
	public int getReadingNumer() {
		return readingNumer;
	}
	/**
	 * @param readingNumer the readingNumer to set
	 */
	public void setReadingNumer(int readingNumer) {
		this.readingNumer = readingNumer;
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
