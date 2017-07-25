package com.trebo.jedis.jedisimp;





import com.trebo.jedis.JedisDAO;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * ssm，spring2部分职责，ioc  管理对象(new A())
 * 
 * JedisDAOSingleImpl对jedis操作的一个封装，之前junti测试jedis就是没有封装jedis操作
 * @author sks
 *
 */
//@Repository
public class JedisDAOSingleImpl implements JedisDAO{
	
	private JedisPool jedisPool;
	
	public JedisPool getJedisPool() {
		return jedisPool;
	}
	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}

	@Override
	public String set(String key, String value) {
		//得到jedis
		Jedis jedis = jedisPool.getResource();
		String str = jedis.set(key, value);
		
		jedis.close();
		return str;
	}

	@Override
	public String get(String key) {
		Jedis jedis = jedisPool.getResource();
		String str = jedis.get(key);
		
		jedis.close();
		return str;
	}

	@Override
	public Long hset(String hkey, String key, String value) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hset(hkey, key, value);
		
		jedis.close();
		return result;
	}

	@Override
	public String hget(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		String result = jedis.hget(hkey, key);
		
		jedis.close();
		return result;
	}

	/**
	 * 给redis中记录设置失效时间
	 */
	@Override
	public Long expire(String key, int second) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.expire(key, second);
		
		jedis.close();
		return result;
	}

	/**
	 * ？
	 */
	@Override
	public Long ttl(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.ttl(key);
		
		jedis.close();
		return result;
	}

	@Override
	public Long del(String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.del(key);
		
		jedis.close();
		return result;
	}

	@Override
	public Long hdel(String hkey, String key) {
		Jedis jedis = jedisPool.getResource();
		Long result = jedis.hdel(hkey, key);
		
		jedis.close();
		return result;
	}

}
