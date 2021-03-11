package com.myd.statefsm.model.create.simplefactory;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/11 18:12
 * @Description:
 */
public class ProductTwo implements Product{
    @Override
    public void print(String name) {
        System.out.println("我是二号产品"+name);
    }
}
