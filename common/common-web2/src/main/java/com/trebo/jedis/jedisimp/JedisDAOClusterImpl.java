package com.trebo.jedis.jedisimp;


import org.springframework.stereotype.Repository;

import com.trebo.jedis.JedisDAO;


//@Repository
public class JedisDAOClusterImpl implements JedisDAO{

	@Override
	public String set(String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String get(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long hset(String hkey, String key, String value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hget(String hkey, String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long expire(String key, int second) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long ttl(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long del(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long hdel(String hkey, String key) {
		// TODO Auto-generated method stub
		return null;
	}

}
