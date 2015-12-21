package cn.com.ron.collector.core.server.netty;

import io.netty.bootstrap.ServerBootstrap;
import cn.com.ron.collector.core.server.Server;

/**
 * Netty服务器
 * 
 * @author Ron
 * @date 2015年12月21日
 */
public class NettyServer implements Server {

	@Override
	public void start(int port) {
		ServerBootstrap bootstrap = new ServerBootstrap();
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub

	}

}
