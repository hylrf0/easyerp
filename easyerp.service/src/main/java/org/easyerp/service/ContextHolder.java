package org.easyerp.service;

import lombok.Data;
import org.easyerp.service.bo.UserInfoBO;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/3/16 0016.
 */
@Service
public class ContextHolder {

    private static ThreadLocal<UserInfoBO> local = new ThreadLocal<UserInfoBO>();

    public static void setUserInfoBO(UserInfoBO userInfoBO) {
        local.set(userInfoBO);
    }

    public static UserInfoBO getUserInfoBO() {
        return local.get();
    }
}
