package cn.com.ron.collector.senders;

import cn.com.ron.collector.core.model.Message;

/**
 * 数据槽
 * 
 * @author Ron
 * @date 2015年12月17日
 */
public interface Sender {

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

}
