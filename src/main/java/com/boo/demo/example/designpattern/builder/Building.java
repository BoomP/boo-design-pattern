package com.boo.demo.example.designpattern.builder;

import lombok.Data;

/** 建筑物
 * description: Building <br>
 * date: 2024/5/15 10:41 <br>
 * author: Boo <br>
 * version: 1.0 <br>
 */
@Data
public class Building {

    /** 地基 */
    private String basement;
    /** 墙体 */
    private String wall;
    /** 房顶 */
    private String roof;

    public String toString()
    {
        return roof + wall + basement;
    }

}
