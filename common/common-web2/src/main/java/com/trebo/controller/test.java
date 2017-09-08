package com.trebo.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.pojo.User_table;
import com.service.User_service;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class test {
	@Autowired
	private User_service service;
	/**
	 * 单机版测试
	 * <p>Title: testSpringJedisSingle</p>
	 * <p>Description: </p>
	 * 111111111111111111 2017-09-08
	 * 
	 * 分支测试
	 */
	// 远程库修改！

	public void testSpringJedisSingle() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext-*.xml");
		JedisPool pool = (JedisPool) applicationContext.getBean("redisClient");
		Jedis jedis = pool.getResource();
		String string = jedis.get("key1");
		System.out.println(string);
		jedis.close();
		pool.close();
	}

	public static void main(String[] args) {
	
		//System.out.println();
		
	}

}
