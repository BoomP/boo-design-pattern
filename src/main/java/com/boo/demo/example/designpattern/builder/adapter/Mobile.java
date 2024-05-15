package com.boo.demo.example.designpattern.builder.adapter;


import lombok.extern.slf4j.Slf4j;

/**
 * 手机
 * 需要5V充电
 */
@Slf4j
public class Mobile {

    // 这里传入的是 v5接口,实现了这个接口的类也可以传入
    public void inputPower(V5Power v5Power) {
        int providePower = v5Power.providePower();
        log.info("---" + "手机(客户端): 我需要的是5V电压充电,现在是" + providePower + "V");
    }
}
