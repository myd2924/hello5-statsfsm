package com.myd.statefsm.senum;

/**
 * @author <a href="mailto:mayuanding@qianmi.com">OF3787-马元丁</a>
 * @version 0.1.0
 * @Date:2021/3/8 17:32
 * @Description:
 */
public enum StateEvent {
    /**
     * 按钮点击
     */
    EVENT_CLICK,
    /**
     * 下载失败
     */
    EVENT_DOWNLOAD_FAILED,
    /**
     * 现在成功
     */
    EVENT_DOWNLOAD_SUCCESS,
    /**
     * 安装失败
     */
    EVENT_INSTALL_FAILED,
    /**
     * 安装成功
     */
    EVENT_INSTALL_SUCCESS

}
