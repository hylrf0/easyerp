package org.easyerp.dao.entity;

import lombok.Data;
import org.easyerp.dao.entity.base.BaseObject;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
@Data
public class User extends BaseObject {

    /**
     * 用户名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;
}
