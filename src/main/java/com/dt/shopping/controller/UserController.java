package com.dt.shopping.controller;

import com.dt.shopping.bean.UserBean;
import com.dt.shopping.dao.UserDao;

import java.util.HashMap;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/UserController")
public class UserController {
    @Resource
    UserDao userDao;

    @RequestMapping(value = {"getuser"},method = {RequestMethod.GET})
    public List<UserBean> getuser(){
        return userDao.getuserD();
    }

    @RequestMapping(value = {"getuserList"},method = {RequestMethod.GET})
    public List<HashMap<String,Object>> getuserList(){
        return userDao.getuserListD();
    }
}
