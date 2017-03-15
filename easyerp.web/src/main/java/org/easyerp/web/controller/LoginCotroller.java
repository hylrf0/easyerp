package org.easyerp.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.easyerp.common.util.ErrorCode;
import org.easyerp.common.util.Result;
import org.easyerp.service.UserService;
import org.easyerp.service.bo.UserInfoBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

@RestController
@RequestMapping("/login")
@Slf4j
public class LoginCotroller {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public Result checkLogin(@RequestBody UserInfoBO userInfoBO, HttpServletRequest request) {
        log.info("用户登录,账号:{}, 密码:{}", userInfoBO.getUsername(), userInfoBO.getPassword());
        try {
            UserInfoBO checkUserInfoBO = userService.getUserInfoByUsernameAndPassword(userInfoBO.getUsername(), userInfoBO.getPassword());
            if(null == checkUserInfoBO) {
                return Result.warpErrorResult(ErrorCode.LOGIN_FAILED);
            }

            return Result.wrapSuccessResult(null);
        } catch (Exception e) {
            log.error("{}", e);
            return Result.warpErrorResult(ErrorCode.SYSTEM_EXCEPTION);
        }

    }
}
