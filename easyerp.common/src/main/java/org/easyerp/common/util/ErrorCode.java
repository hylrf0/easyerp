package org.easyerp.common.util;

/**
 * Created by Administrator on 2017/3/8 0008.
 * 错误代码
 */

public enum ErrorCode {
    LOGIN_FAILED("000001", "账号名或密码错误"),
    UNDEFINED_CODE("999999", "%s");
    ;
    private String code;

    private String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
