package com.qg.kinectpatient.logic;


import com.qg.kinectpatient.param.GetDUserByPhoneParam;
import com.qg.kinectpatient.param.LoginParam;
import com.qg.kinectpatient.param.UpdatePUserParam;
import com.qg.kinectpatient.result.GetDUserByPhoneResult;
import com.qg.kinectpatient.result.LoginResult;
import com.qg.kinectpatient.result.UpdatePUserResult;

/**
 * Created by ZH_L on 2016/10/21.
 */
public interface Logic {

    void getDUserByPhone(GetDUserByPhoneParam param, LogicHandler<GetDUserByPhoneResult> handler);

    void login(LoginParam param, LogicHandler<LoginResult> handler);

    void updatePUser(UpdatePUserParam param, LogicHandler<UpdatePUserResult> handler);
}
