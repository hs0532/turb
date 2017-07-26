package com.mapper;

import java.util.List;

import com.pojo.picpojo;

public interface picMapper {
	void insertPic(picpojo picpojo);
	picpojo selectPic(String name);
	List<picpojo> getImage();

}
