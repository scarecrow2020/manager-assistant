package com.lmz.hc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmz.hc.model.User;

public interface UserService extends IService<User> {
    User getUser(Long id);
}
