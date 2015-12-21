package cn.com.ron.collector.channels;

import cn.com.ron.collector.core.model.Message;

/**
 * 管道
 * 
 * @author Ron
 * @date 2015年12月17日
 */
public interface Channel {

	/**
	 * 初始化
	 */
	public void init();

	/**
	 * 流入
	 */
	public void inflow(Message message);

	/**
	 * 流出
	 */
	public void outflow(Message message);

	/**
	 * 获取消息积压数
	 * 
	 * @return long
	 */
	public long getMessageCount();

}
