package com.github.zhangshuli.exception.exceptionDemo1;

/**
 * Created by ShuliZhang on 16/9/7.
 */
public class ExceptionDemo {
    public int div(int a, int b)throws ArithmeticException, ArrayIndexOutOfBoundsException {
        int[] arry = new int[a];
        System.out.println(arry[4]);
        return a / b;
    }

    public static void main(String[] args) {
        try {
            ExceptionDemo demo = new ExceptionDemo();
            double x = demo.div(5 , 0);
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("除零");
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组越界");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("over");
    }
}
