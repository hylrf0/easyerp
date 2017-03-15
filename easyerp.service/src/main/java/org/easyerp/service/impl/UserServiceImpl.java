package org.easyerp.service.impl;

import org.easyerp.dao.entity.UserInfo;
import org.easyerp.dao.mapper.UserInfoMapper;
import org.easyerp.service.UserService;
import org.easyerp.service.bo.UserInfoBO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/3/15 0015.
 * 用户信息服务层
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfoBO getUserInfoByUsernameAndPassword(String username, String password) {
        UserInfo userInfo = userInfoMapper.getUserInfoByUsernameAndPassword(username, password);
        if (null == userInfo) {
            return null;
        }
        return fillUserInfoBOByUserInfo(userInfo);
    }

    private UserInfoBO fillUserInfoBOByUserInfo(UserInfo userInfo) {
        UserInfoBO userInfoBO = new UserInfoBO();
        BeanUtils.copyProperties(userInfo, userInfoBO);
        return userInfoBO;
    }
}
