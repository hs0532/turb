package com.mapper;

import com.pojo.picpojo;

public interface picMapper {
	void insertPic(picpojo picpojo);
	picpojo selectPic(String name);

}
