package org.easyerp.dao.entity;

import lombok.Data;
import org.easyerp.dao.entity.base.BaseObject;

import java.util.Date;

@Data
public class MenuInfo extends BaseObject {

    /**
     * 父菜单 0表示一级菜单 -1只有超级管理员才能看到
     */
    private Integer parentId;

    /**
     * 菜单名称
     */
    private String menuName;
}