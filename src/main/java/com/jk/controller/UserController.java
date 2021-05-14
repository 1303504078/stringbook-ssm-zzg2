package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.pojo.UserBean;
import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/* *
 * @Author: zzg
 * @Description:
* @Date: 2021/4/26 17:12

 * @Return: 
 **/
@RestController
@RequestMapping("zzg")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("query")
    public List<UserBean>query(){
        return  userService.query();
    }

}
