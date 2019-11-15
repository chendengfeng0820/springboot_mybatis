package com.springboot.mapper;

import com.springboot.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author cdf
 */
@Mapper
public interface UserMapper {

	public List<User> queryUserList();
}
