package com.springboot.controller;


import com.springboot.domain.Teacher;
import com.springboot.domain.User;
import com.springboot.mapper.TeacherMapper;
import com.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class MybatisController {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private TeacherMapper teacherMapper;

	@RequestMapping("/query")
	@ResponseBody
	public List<User> queryUserList(){
		List<User> users = userMapper.queryUserList();
		return users;
	}
	@RequestMapping("/teacherList")
    @ResponseBody
	public List<Teacher> teacherList(){
	    List<Teacher> teachers=teacherMapper.teacherList();
	    return teachers;
    }



}
