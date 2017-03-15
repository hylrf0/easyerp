package org.easyerp.dao.entity;

import lombok.Data;
import org.easyerp.dao.entity.base.BaseObject;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
@Data
public class UserInfo extends BaseObject {

    /**
     * 用户名称
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 中文名
     */
    private String name;

    /**
     * 组织ID
     */
    private Integer groupId;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * QQ
     */
    private String qq;

    /**
     * 微信
     */
    private String weChat;

    /**
     * 邮箱
     */
    private String email;
}
