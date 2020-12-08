package com.lesson.l5.online.generic;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

     Robot<BigHead> headRobot = new Robot<>(new Body(),new BigHead());
     Robot2 robot2 = new Robot2(new Body(), new BigHead());
        Robot<SmallHead> robot3 = new Robot(new Body(), new SmallHead());
        robot3.getH().burn();
        Robot<SmallHead> robot4 = new Robot(new Body(), new SmallHead());
       robot4.getH().burn();

     Robot<MediumHead> headRobot1 = new Robot<>(new Body(), new MediumHead());
     Robot.getRobot(headRobot1);
        Robot.getRobot(robot3);
        Robot robot = new Robot(new Body(), new MediumHead());
        robot.printHead();

        List<Robot<BigHead>> list = new ArrayList<>();
        list.add(new Robot<>(new Body(), new BigHead()));
        list.add(new Robot<>(new Body(), new BigHead()));


        List<Robot2> list1 = new ArrayList<>();
        list1.add(new Robot2(new Body(), new BigHead()));
        list1.add(new Robot2(new Body(), new SmallHead()));

       /* Pult pult = new SonyPult();
        pult.button1();
        SonyPult sonyPult = new SonyPult();
        sonyPult.button4();
        SonyPult2 sonyPult2 = new SonyPult2();
        sonyPult2.but6();*/


    }
}
