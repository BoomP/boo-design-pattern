package com.boo.demo.example.designpattern.builder.adapter;

import com.boo.demo.example.designpattern.builder.adapter.impl.V12PowerAdapter;
import com.boo.demo.example.designpattern.builder.adapter.impl.V5PowerAdapter;

/**
 * 适配器模式:
 * 作为两个不兼容接口之间的桥梁
 * 定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。
 * 这个定义还好，说适配器的功能就是把一个接口转成另一个接口。
 * 如题目，手机充电器一般都是5V左右吧，咱天朝的家用交流电压220V，所以手机充电需要一个适配器（降压器）
 */
public class AdapterActivity {

    public static void main(String[] args) {
        V220Power v220Power = new V220Power();
        Mobile mobile = new Mobile();
        mobile.inputPower(new V5PowerAdapter(v220Power));

        Television television = new Television();
        television.inputPower(new V12PowerAdapter(v220Power));
    }
}
