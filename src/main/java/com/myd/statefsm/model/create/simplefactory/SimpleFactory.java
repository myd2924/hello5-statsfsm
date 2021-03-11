package com.myd.statefsm.model.create.simplefactory;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/11 19:01
 * @Description:
 */
public class SimpleFactory {

    public static Product getPro(String pro){
        switch (pro){
            case Cons.PRO1:
                return new ProductOne();
            case Cons.PRO2:
                return new ProductTwo();
                default:
                    return null;
        }
    }
}
