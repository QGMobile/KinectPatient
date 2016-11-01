package com.qg.kinectpatient.logic;


import com.qg.kinectpatient.param.GetDUserByPhoneParam;
import com.qg.kinectpatient.param.GetMRParam;
import com.qg.kinectpatient.param.GetRcStageParam;
import com.qg.kinectpatient.param.LoginParam;
import com.qg.kinectpatient.result.GetDUserByPhoneResult;
import com.qg.kinectpatient.result.GetMRResult;
import com.qg.kinectpatient.result.GetRcStageResult;
import com.qg.kinectpatient.result.LoginResult;

/**
 * Created by ZH_L on 2016/10/21.
 */
public interface Logic {

    void getDUserByPhone(GetDUserByPhoneParam param, LogicHandler<GetDUserByPhoneResult> handler);

    void login(LoginParam param, LogicHandler<LoginResult> handler);

    public void getMR(GetMRParam param, LogicHandler<GetMRResult> handler);

    public void getRcStage(GetRcStageParam param, LogicHandler<GetRcStageResult> handler);
}
