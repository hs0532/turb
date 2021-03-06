package com.service;



import java.util.Date;
import java.util.List;

import javax.swing.JEditorPane;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.jedis.JedisDAO;
import com.mapper.UserMapper;
import com.mapper.UsersMapper;
import com.pojo.User;
import com.pojo.User_table;
import com.util.JsonUtils;
@Service
public class User_service {
	@Autowired
	private UserMapper mapper;
	@Autowired
	private UsersMapper usermapper;
	
	@Autowired
	private JedisDAO jedisDAO;
	
	
	private String INDEX_CONTENT_REDIS_KEY = "INDEX_CONTENT_REDIS_KEY";
	
	public List<User_table> getUser(){
		List<User_table> list = mapper.selectAll();
		String categoryId = list.get(0).getName(); 
		//向缓存中添加内容
				try {
					//把list转换成字符串
					String cacheString = JsonUtils.objectToJson(list);
					jedisDAO.hset(INDEX_CONTENT_REDIS_KEY, categoryId+"", JsonUtils.objectToJson(list) );
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		return list;
	}
	public List<User_table>  selectUser(String name){
		List<User_table> list = mapper.finduser(name);
		String categoryId = list.get(0).getName(); 
		//向缓存中添加内容
				try {
					//把list转换成字符串
					String cacheString = JsonUtils.objectToJson(list);
					jedisDAO.hset(INDEX_CONTENT_REDIS_KEY, categoryId+"", JsonUtils.objectToJson(list) );
					
				} catch (Exception e) {
					e.printStackTrace();
				}

		return list;
	}
	/**
	 * 用户验证
	 * @param name
	 * @return
	 */
	public User checkUser(String name){
		// 先查询缓存，若缓存中查询不到，进行数据库查询
		try {
			String cache = jedisDAO.hget("checkuser", name+"");
			if (!StringUtils.isEmpty(cache)) {//if(cache!=null && cache.trim().length()>0)
				//将cache转回到List<TbContent>
				User list = JsonUtils.jsonToPojo(cache, User.class);
				User retList = null;
				if(list!=null){
					retList = list;
				}
				System.out.println("缓存查询");
				return retList;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		User list = usermapper.finduser(name);
		if(list!=null){
		String categoryId = list.getUsername(); 
		//向缓存中添加内容
				try {
					//把list转换成字符串
					String cacheString = JsonUtils.objectToJson(list);
					jedisDAO.hset("checkuser", categoryId+"", JsonUtils.objectToJson(list) );
					
				} catch (Exception e) {
					e.printStackTrace();
				}
		}

		return list;
	
	}
	public String addUser(User user){
		user.setCreatedate(new Date());
		usermapper.insert(user);
		
		return "success";
	}
	

}

