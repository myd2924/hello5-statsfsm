package com.myd.statefsm.state;

import com.myd.statefsm.senum.StateEvent;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/8 17:30
 * @Description:
 */
public abstract class FSMState {
    /**
     * 一个状态必须要持有状态环境对象stateContext，
     * 才能在状态迁移的时候，更新stateContext中的当前状态
     */
    protected StateContext stateContext;

    public void setStateContext(StateContext stateContext){
        this.stateContext = stateContext;
    }

    protected void updateView(String str){
        System.out.println("update button view "+str);
    }

    protected abstract void doAction(StateEvent event);

    protected abstract void transState(StateEvent event);

    public abstract void eventChange(StateEvent event);

}
