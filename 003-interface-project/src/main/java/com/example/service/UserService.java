package com.example.service;

import com.example.model.User;

public interface UserService {

    /*根据用户ID获取用户信息*/
    User queryUser(Integer id);
}
