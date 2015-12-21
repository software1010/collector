package cn.com.ron.collector.core.server;

/**
 * 服务器
 * 
 * @author Ron
 * @date 2015年12月21日
 */
public interface Server {
	/**
	 * 启动
	 * 
	 * @param port
	 *            端口
	 */
	public void start(int port);

	/**
	 * 停止
	 */
	public void stop();

}
