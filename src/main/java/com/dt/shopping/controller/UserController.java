package com.dt.shopping.controller;

import com.dt.shopping.bean.UserBean;
import com.dt.shopping.dao.UserDao;

import java.util.HashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("api/UserController")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Resource
    UserDao userDao;

    @RequestMapping(value = {"getuser"},method = {RequestMethod.GET})
    public List<UserBean> getuser(){
        logger.info("hello");
        return userDao.getuserD();
    }

    @RequestMapping(value = {"getuserList"},method = {RequestMethod.GET})
    public List<HashMap<String,Object>> getuserList(){
        return userDao.getuserListD();
    }
}
