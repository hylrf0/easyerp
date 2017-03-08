package org.easyerp.controller;

import org.easyerp.common.util.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

@RestController
@RequestMapping("/login")
public class LoginCotroller {


    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public Result checkLogin(String username, String password) {
        System.out.println("username: " + username);
        System.out.println("password: " + password);
        return Result.wrapSuccessResult(null);
    }
}
