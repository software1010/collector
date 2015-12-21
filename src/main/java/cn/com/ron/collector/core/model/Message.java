package cn.com.ron.collector.core.model;

import java.io.Serializable;

/**
 * 消息
 * 
 * @author Ron
 * @date 2015年12月17日
 */
public class Message implements Serializable {

	private static final long	serialVersionUID	= -6263038301505794959L;

	/**
	 * 消息头
	 */
	private String				head;
	/**
	 * 消息标签
	 */
	private String				tag;
	/**
	 * 消息体
	 */
	private String				body;

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

}
