package com.boo.demo.example.designpattern.adapter.impl;

import com.boo.demo.example.designpattern.adapter.V12Power;
import com.boo.demo.example.designpattern.adapter.V220Power;
import lombok.extern.slf4j.Slf4j;

/**
 * 将200v家用电转换为12v的适配器
 * 一般电视、路由器、吸尘器等家电用
 */
@Slf4j
public class V12PowerAdapter implements V12Power {

    private int v220power;

    public V12PowerAdapter(V220Power v220Power) {
        v220power = v220Power.provideV220Power();
    }

    @Override
    public int providePower() {
        log.info("---" + "12v适配器: 经过复杂的操作,将" + v220power + "v电压转为12v");
        return 5;
    }


}
