package com.myd.statefsm.state.impl;

import com.myd.statefsm.senum.StateEvent;
import com.myd.statefsm.state.FSMState;
import com.myd.statefsm.state.StateContext;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/9 10:01
 * @Description: 去下载
 */
public class StateToInstall extends FSMState {
    @Override
    protected void doAction(StateEvent event) {
        if(StateEvent.EVENT_CLICK.equals(event) && !CheckDownloaded()){
            System.out.println("current state = StateToInstall event change signal = click button do action download()");
            updateView("下载中loading...");
            return;
        }
        if(StateEvent.EVENT_CLICK.equals(event) && CheckDownloaded()){
            System.out.println("current state = StateToInstall,event change signal = click button, do action install()");
            updateView("安装中...");
            return;
        }
    }

    @Override
    protected void transState(StateEvent event) {

        if(StateEvent.EVENT_CLICK.equals(event) && !CheckDownloaded()){
            System.out.println("current state = StateToInstall, "
                    + "event change signal = click button, "
                    + "transfer state to StateDownloading");
            stateContext.setCurrState(StateContext.stateDownloading);
            return ;

        }
        if(StateEvent.EVENT_CLICK.equals(event) && CheckDownloaded()){
            System.out.println("current state = StateToInstall, "
                    + "event change signal = click button, "
                    + "transfer state to StateInstalling");
            stateContext.setCurrState(StateContext.stateInstalling);
            return ;
        }

    }

    @Override
    public void eventChange(StateEvent event) {
        doAction(event);
        transState(event);
    }

    private boolean CheckDownloaded(){
        return false;
    }
}
