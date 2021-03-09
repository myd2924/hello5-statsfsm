package com.myd.statefsm.state.impl;

import com.myd.statefsm.senum.StateEvent;
import com.myd.statefsm.state.FSMState;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/9 10:02
 * @Description: 下载失败
 */
public class StateDownloadFailed extends FSMState {
    @Override
    protected void doAction(StateEvent event) {

    }

    @Override
    protected void transState(StateEvent event) {

    }

    @Override
    public void eventChange(StateEvent event) {

    }
}
