package com.myd.statefsm.state;

import com.myd.statefsm.senum.StateEvent;
import com.myd.statefsm.state.impl.*;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/8 17:30
 * @Description:
 */
public class StateContext {
    /**
     * 当前状态
     */
    private FSMState currState;

    /**
     * 定义所有状态
     */
    public static final StateToInstall stateToInstall = new StateToInstall();
    public static final StateDownloading stateDownloading = new StateDownloading();
    public static final StateDownloadFailed stateDownloadFailed = new StateDownloadFailed();
    public static final StateInstalling stateInstalling = new StateInstalling();
    public static final StateInstallFailed stateInstallFailed = new StateInstallFailed();
    public static final StateToOpen stateToOpen = new StateToOpen();

    public StateContext(FSMState state) {
        //context对象传递给当前状态对象
        this.currState=state;
        this.currState.setStateContext(this);

    }

    /**
     *  获取当前状态
     */
    public FSMState getCurrState() {
        return this.currState;

    }

    /**
     *  设置当前状态
     */
    public void setCurrState(FSMState currState) {
        //context对象传递给当前状态对象
        this.currState =currState;
        this.currState.setStateContext(this);

    }
    /**
     *  触发条件改变
     **/

    public void eventChange(StateEvent e) {
        currState.eventChange(e);
    }

}
