package com.lmz.hc.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lmz.hc.mapper.UserMapper;
import com.lmz.hc.model.SysUser;
import com.lmz.hc.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, SysUser> implements UserService {

    @Override
    @Transactional(readOnly = true)
    public SysUser getUser(Long id){
       return baseMapper.selectById(id);
    }
}
