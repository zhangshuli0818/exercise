package com.github.zhangshuli.exception.exceptionDemo3;

/**
 * Created by ShuliZhang on 16/9/7.
 */
public class ExceptionDemo {

    int div(int a, int b) throws ArithmeticException {
//        if(b == 0) {
//            throw new ArithmeticException("除零");
//        }
        return a/b;
    }

    public static void main(String[] args) {
        ExceptionDemo d = new ExceptionDemo();
        int x = d.div(3, 0);
        System.out.println(x);
    }
}
