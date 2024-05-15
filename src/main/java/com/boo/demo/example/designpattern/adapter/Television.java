package com.boo.demo.example.designpattern.adapter;

import lombok.extern.slf4j.Slf4j;

/** 电视
 * description: Television <br>
 * date: 2024/5/15 11:48 <br>
 * author: Boo <br>
 * version: 1.0 <br>
 */
@Slf4j
public class Television  {

    public void inputPower(V12Power power) {
        int providePower = power.providePower();
        log.info("---" + "电视(客户端): 我需要的是12电压充电,现在是" + providePower + "V");
    }

}
