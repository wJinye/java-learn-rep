package com.example.service.impl;

import com.example.model.User;
import com.example.service.UserService;

public class UserSeviceIpl implements UserService {

    @Override
    public User queryUser(Integer id ) {

        User u = new User();
        u.setId(id);
        u.setName("wangdage"+id);
        return u;
    }
}
