package com.lmz.hc.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lmz.hc.model.SysUser;

public interface UserService extends IService<SysUser> {
    SysUser getUser(Long id);
}
