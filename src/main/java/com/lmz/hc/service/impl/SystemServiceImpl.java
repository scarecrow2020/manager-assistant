package com.lmz.hc.service.impl;

import com.lmz.hc.mapper.UserMapper;
import com.lmz.hc.model.SysUser;
import com.lmz.hc.service.SystemService;
import com.lmz.hc.utils.Globals;
import com.lmz.hc.utils.ResultMap;
import com.lmz.hc.utils.UserInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * User: Scarecrow
 * Date: 2019/1/3
 * Time: 13:41
 * Description: 系统服务
 */
@Service
@Transactional
public class SystemServiceImpl implements SystemService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional(readOnly = true)
    public ResultMap login(String userName, String password) {
        SysUser user = userMapper.getUserByUserName(userName);
        if (user == null)
            return new ResultMap(false, "用户名错误");
        if (!StringUtils.equals(user.getPassword(), password))
            return new ResultMap(false, "密码错误");
        UserInfo info = new UserInfo();
        info.setName(user.getName());
        info.setJobNumber(user.getJobNumber());
        info.setRole(user.getRole());
        info.setLoginDate(new Date());
        info.setOperateDate(info.getLoginDate());
        info.setUserId(user.getId());
        info.setLoginUuid(UUID.randomUUID().toString());
        synchronized (Globals.USER_INFOS) {
            delGlobalsUserInfo(user.getId());
            Globals.USER_INFOS.put(info.getLoginUuid(), info);
        }
        return new ResultMap(true, info);
    }

    @Override
    public void logout(Long userId) {
        synchronized (Globals.USER_INFOS) {
            delGlobalsUserInfo(userId);
        }
    }

    private void delGlobalsUserInfo(Long userId) {
        List<String> keyList = new ArrayList<>();
        for (Map.Entry<String, UserInfo> entry : Globals.USER_INFOS.entrySet()) {
            if (entry.getValue().getUserId().equals(userId))
                keyList.add(entry.getKey());
        }
        keyList.forEach(key -> Globals.USER_INFOS.remove(key));
    }
}
