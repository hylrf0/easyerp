package org.easyerp.service;

import org.easyerp.service.bo.UserInfoBO;

/**
 * Created by Administrator on 2017/3/15 0015.
 */
public interface UserService {

    /**
     * 根据用户名和密码获取用户信息
     * @param username
     * @param password
     * @return
     */
    UserInfoBO getUserInfoByUsernameAndPassword(String username, String password);
}
