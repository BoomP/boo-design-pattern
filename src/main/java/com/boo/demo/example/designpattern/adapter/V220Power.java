package com.boo.demo.example.designpattern.adapter;


import lombok.extern.slf4j.Slf4j;

/**
 * 我们拥有的家用电是220v
 */
@Slf4j
public class V220Power {

    public int provideV220Power() {
        log.info("---" + "现有类: 我们提供的是220v的家用电");
        return 220;
    }
}
