package cn.com.ron.collector.sources;

import cn.com.ron.collector.core.model.Message;

/**
 * 数据源
 * 
 * @author Ron
 * @date 2015年12月17日
 */
public interface Source {

	/**
	 * 初始化
	 */
	public void init();

	/**
	 * 流出
	 */
	public void outflow(Message message);

}
