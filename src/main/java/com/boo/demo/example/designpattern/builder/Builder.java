package com.boo.demo.example.designpattern.builder;

/**
 * 抽象建造者
 * 抽象类是对事物属性、行为的抽象，大多指存在的事物（看得见摸得着的） ，比如：麻雀、喜鹊、乌鸦 继承了 鸟这个抽象类
 * 接口是 对事物行为或功能的抽象提取 ， 比如：滑翔、喷气、螺旋推进、火箭推进 实现了 飞行这个接口
 */
public abstract class Builder {
    public abstract void buildBasement();
    public abstract void buildWall();
    public abstract void buildRoof();

    public abstract Building getBuilding();

}
