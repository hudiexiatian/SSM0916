package com.baidu.www.exception;

/**
 * 自定义异常类
 * Created by Administrator on 2016/9/16.
 */
public class CustomException extends Exception {

    private String message;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
