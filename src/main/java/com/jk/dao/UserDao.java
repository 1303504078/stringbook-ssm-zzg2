package com.jk.dao;

import com.jk.pojo.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface UserDao {
    @Select("select * from t_user")
    List<UserBean> query();
}
