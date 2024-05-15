package com.boo.demo.example.designpattern.builder.impl;

import com.boo.demo.example.designpattern.builder.Building;
import com.boo.demo.example.designpattern.builder.Builder;

/** 公寓楼建造者
 * description: ApartmentBuilde <br>
 * date: 2024/5/15 10:49 <br>
 * author: Boo <br>
 * version: 1.0 <br>
 */
public class ApartmentBuilder extends Builder {

    private Building apartment;

    public ApartmentBuilder() {
        this.apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("深挖地基，修建地下车库，部署管道、线缆、风道。");
        apartment.setBasement("╚═════════╝\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建多层建筑框架，建造电梯井，钢筋混凝土浇灌。");
        for (int i = 0; i < 8; i++) {// 此处假设固定8层
            if (apartment.getWall() == null){
                apartment.setWall("║ □ □ □ □ ║\n");
            }else {
                apartment.setWall(apartment.getWall() + "║ □ □ □ □ ║\n");
            }
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("封顶，部署通风井，做防水层，保温层。");
        apartment.setRoof("╔═════════╗\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}