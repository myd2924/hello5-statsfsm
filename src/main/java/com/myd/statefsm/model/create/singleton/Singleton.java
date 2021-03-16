package com.myd.statefsm.model.create.singleton;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/11 17:45
 * @Description: 单例懒汉模式 线程安全 效率高
 */
public class Singleton {

    private static volatile Singleton instance = null;

    /**
     * 私有化构造器
     */
    private Singleton(){
        System.out.println("构造函数私有，不让外部访问");
    }

    /**
     * 获取实例
     * @return
     */
    public static Singleton getInstance(){

        if(null == instance){
            synchronized (Singleton.class){
                if(null == instance){
                    instance = new Singleton();
                }
            }
        }

        return instance;

    }

}
