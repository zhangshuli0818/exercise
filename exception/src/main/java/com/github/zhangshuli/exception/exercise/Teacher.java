package com.github.zhangshuli.exception.exercise;

/**
 * Created by ShuliZhang on 16/9/7.
 */
public class Teacher {
    String name;
    Computer computer;
    Teacher(String name) {
        this.name = name;
        computer = new Computer();
    }

    public void prelect() {
        try {
            computer.run();
        } catch (BlueScreenException e) {
            computer.reset();
        } catch (SmokeException e) {

        }
        System.out.println("讲课");
    }
}
