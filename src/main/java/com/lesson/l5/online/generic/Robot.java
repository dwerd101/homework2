package com.lesson.l5.online.generic;

public class Robot<H extends Head> {

    private Body body;
    private H h;

    public Robot(Body body, H h) {
        this.body = body;
        this.h = h;
    }
    public static void getRobot(Robot<?> robot) {
        System.out.println(robot.getH());
    }

    public void printHead() {
        System.out.println(h);
    }

    public H getH() {
        return h;
    }

    public void setH(H h) {
        this.h = h;
    }
}
