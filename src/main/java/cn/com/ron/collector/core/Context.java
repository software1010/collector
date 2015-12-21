package cn.com.ron.collector.core;

import java.util.HashMap;
import java.util.Map;

/**
 * 上下文
 * 
 * @author Ron
 * @date 2015年12月21日
 */
public class Context {
	/**
	 * 上下文存储容器
	 */
	private Map<String, Object>	context	= new HashMap<String, Object>();

	/**
	 * 存入上下文
	 * 
	 * @param key
	 * @param value
	 */
	public void put(String key, Object value) {
		context.put(key, value);
	}

	/**
	 * 集合存入上下文
	 * 
	 * @param map
	 */
	public void putAll(Map<String, Object> map) {
		context.putAll(map);
	}

	/**
	 * 从上下文获取值
	 * 
	 * @param key
	 * @return
	 */
	public Object get(String key) {
		return context.get(key);
	}

	/**
	 * 从上下文获取值，如果不存在则使用缺省值
	 * 
	 * @param key
	 * @param defaultValue
	 * @return
	 */
	public Object getOrDefault(String key, Object defaultValue) {
		Object value = context.get(key);
		if (value == null) {
			return defaultValue;
		}
		return value;
	}
	
}
