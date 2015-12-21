package cn.com.ron.collector.core;

import cn.com.ron.collector.core.server.Server;
import cn.com.ron.collector.core.server.netty.NettyServer;

/**
 * 主程序入口
 * 
 * @author Ron
 * @date 2015年12月21日
 */
public class Collector {

	public static void main(String[] args) {
		Server server = new NettyServer();
		server.start(8080);
	}

}
