package com.boo.demo.example.designpattern.chainofresponsibility.impl;


import com.boo.demo.example.designpattern.chainofresponsibility.AbstractLogger;
import lombok.extern.slf4j.Slf4j;

/**
 */
@Slf4j
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        log.info("---" + "Error::Logger  " + message);
    }
}
