package com.github.zhangshuli.exception.exercise;

/**
 * Created by ShuliZhang on 16/9/7.
 */
public class Computer {
    private int state = 2;
    public void run() throws BlueScreenException {
        if(state == 2) {
            throw new BlueScreenException("蓝屏");
        }
        if(state == 3) {
            throw new SmokeException("冒烟了");
        }
        System.out.println("电脑运行");
    }

    public void reset() {
        state = 1;
        System.out.println("电脑重启");
    }
}
