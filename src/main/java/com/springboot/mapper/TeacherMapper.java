package com.springboot.mapper;


import com.springboot.domain.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeacherMapper {

    public List<Teacher> teacherList();

}
