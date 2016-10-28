package com.qg.kinectpatient.logic;


import com.qg.kinectpatient.param.GetDUserByPhoneParam;
import com.qg.kinectpatient.result.GetDUserByPhoneResult;

/**
 * Created by ZH_L on 2016/10/21.
 */
public interface Logic {

    void getDUserByPhone(GetDUserByPhoneParam param, LogicHandler<GetDUserByPhoneResult> handler);
}
