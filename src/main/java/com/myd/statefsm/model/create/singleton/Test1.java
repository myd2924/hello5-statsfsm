package com.myd.statefsm.model.create.singleton;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/11 17:56
 * @Description:
 */
public class Test1 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        // true
        System.out.println(instance.equals(instance1));
    }
}
