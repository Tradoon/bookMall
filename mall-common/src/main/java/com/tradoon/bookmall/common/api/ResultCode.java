package com.tradoon.bookmall.common.api;

/**
 * author:tradoon
 * desciption: 枚举成功/失败的各种情况
 * date:
 */
public enum ResultCode {
    SUCCESS(200,"请求成功"),
    FAILED(500,"服务器内部错误");
    //枚举依赖全参构造函数
    //枚举之间是，分割
    //todo 还待增加

    private long code;

    private String message;


    ResultCode(int code, String message) {
        this.code=code;
        this.message=message;
    }
    public long getCode(){
        return this.code;
    }

    public String getMessage(){
        return this.message;
    }
}
