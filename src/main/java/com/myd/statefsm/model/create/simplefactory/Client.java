package com.myd.statefsm.model.create.simplefactory;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/11 19:08
 * @Description: 感觉这种简单静态工厂模式用的很少
 */
public class Client {
    public static void main(String[] args) {
        Product pro = SimpleFactory.getPro(Cons.PRO1);
        pro.print("大曦");
        Product pro1 = SimpleFactory.getPro(Cons.PRO2);
        pro1.print("二曦");
    }
}
