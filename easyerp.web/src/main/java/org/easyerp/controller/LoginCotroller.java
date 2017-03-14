package org.easyerp.controller;

import org.easyerp.common.util.ErrorCode;
import org.easyerp.common.util.Result;
import org.easyerp.dao.entity.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 * Created by Administrator on 2017/3/8 0008.
 */

@RestController
@RequestMapping("/login")
public class LoginCotroller {


    @RequestMapping(value = "/checkLogin", method = RequestMethod.POST)
    public Result checkLogin(@RequestBody User user, HttpServletRequest request) {
        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());

        HttpSession session = request.getSession();

        System.out.println(session.getId());

        Random random = new Random();
        Integer num = random.nextInt(10);
        System.out.println(num);
        if (num > 5) {
            return Result.wrapSuccessResult(null);
        } else {
            return Result.warpErrorResult(ErrorCode.LOGIN_FAILED);
        }
    }
}
