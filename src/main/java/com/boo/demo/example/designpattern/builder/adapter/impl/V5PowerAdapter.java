package com.boo.demo.example.designpattern.builder.adapter.impl;

import com.boo.demo.example.designpattern.builder.adapter.V220Power;
import com.boo.demo.example.designpattern.builder.adapter.V5Power;
import lombok.extern.slf4j.Slf4j;

/**
 * 将200v家用电转换为5v的适配器
 *
 * 一般手机、台灯
 */
@Slf4j
public class V5PowerAdapter implements V5Power {

    private int v220power;

    public V5PowerAdapter(V220Power v220Power) {
        v220power = v220Power.provideV220Power();
    }

    @Override
    public int providePower() {

        log.info("---" + "5V适配器: 经过复杂的操作,将" + v220power + "v电压转为5v");
        return 5;
    }


}
