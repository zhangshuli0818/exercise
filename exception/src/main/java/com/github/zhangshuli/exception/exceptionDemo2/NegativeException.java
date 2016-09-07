package com.github.zhangshuli.exception.exceptionDemo2;

/**
 * Created by ShuliZhang on 16/9/7.
 */
public class NegativeException extends Exception {

//    private String message;
    private int value;
    NegativeException(String message, int value) {
//        this.message = message;
        super(message);
        this.value = value;
    }

//    public String getMessage() {
//        return message;
//    }

    public int getValue() {
        return value;
    }
}
