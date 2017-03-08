package org.easyerp.common.util;

import lombok.Data;

/**
 * Created by Administrator on 2017/3/8 0008.
 */
@Data
public class Result<T> {

    private T data;

    private boolean isSuccess;

    private String code;

    private String message;

    private Result(T data, boolean isSuccess, String code, String message){
        this.data = data;
        this.isSuccess = isSuccess;
        this.code = code;
        this.message = message;
    }

    /**
     * 返回成功结果
     * @param data
     * @param <T>
     * @return
     */
    public static <T> Result wrapSuccessResult(T data) {
        return new Result(data, true, Constants.SUCCESS_CODE, Constants.EMPTY_STRING);
    }

    /**
     * 返回失败结果
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> Result warpErrorResult(String code, String message) {
        return new Result(null, false, code, message);
    }
}
