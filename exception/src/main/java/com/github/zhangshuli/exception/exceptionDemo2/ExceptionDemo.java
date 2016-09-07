package com.github.zhangshuli.exception.exceptionDemo2;

/**
 * Created by ShuliZhang on 16/9/7.
 */
public class ExceptionDemo {
    public int div(int a, int b) throws NegativeException {
        if (b < 0) {
            throw new NegativeException("出现了除数是负数的情况 /by negative", b);
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            ExceptionDemo demo = new ExceptionDemo();
            int x = demo.div(3, -1);
            System.out.println("x : " + x);
        } catch (NegativeException e) {
            System.out.println(e.getMessage());
            System.out.println("错误的负数是：" + e.getValue());
        }
        System.out.println("over");
    }
}
