package com.boo.demo.example.designpattern.chainofresponsibility.impl;


import com.boo.demo.example.designpattern.chainofresponsibility.AbstractLogger;
import lombok.extern.slf4j.Slf4j;

/**
 * 2. 创建扩展了该记录器类的实体类。
 */
@Slf4j
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("---" + "Console::Logger  " + message);
    }
}
