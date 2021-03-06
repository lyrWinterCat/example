package com.project.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import vo.UserVO;

@Mapper
public interface UserMapper {
	public List<UserVO> user_list(String userId);
	public void user_insert(UserVO userVO);
	public Integer user_login(HashMap<String, String> userMap);
	public Integer checkId(String userId);
	public Integer checkNick(String userNick);
	
}
