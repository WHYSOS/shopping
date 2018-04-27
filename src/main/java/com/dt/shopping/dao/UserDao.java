package com.dt.shopping.dao;

import com.dt.shopping.bean.UserBean;

import java.util.HashMap;
import java.util.List;

public interface UserDao {
    List<UserBean> getuserD();
    List<HashMap<String,Object>> getuserListD();
}
