package org.easyerp.dao.entity.base;

import lombok.Data;

import java.util.Date;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
@Data
public class BaseObject {

    /** 自增ID **/
    private Integer id;

    /** 是否删除  Y-已删除 N-未删除 **/
    private String isDeleted;

    /** 新增人 **/
    private Integer creator;

    /** 修改人 **/
    private Integer modifier;

    /** 新增日期 **/
    private Date createTime;

    /** 修改日期 **/
    private Date modifyTime;
}
