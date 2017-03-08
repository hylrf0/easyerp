package org.easyerp.controller;

import org.easyerp.common.util.Result;
import org.easyerp.dao.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
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
    public Result checkLogin(@RequestBody User user) {
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        return Result.wrapSuccessResult(null);
    }
}
