package com.qg.kinectpatient.result;

import com.qg.kinectpatient.model.PUser;

/**
 * Created by ZH_L on 2016/10/22.
 */
public class LoginResult extends Result{
//    private int status;//状态，1为登陆成功，0为密码错误，2为不存在用户
    private PUser pUser;//仅在登陆成功时数据有效

    public int getStatus() {
        return status;
    }

    public PUser getPUser() {
        return pUser;
    }

}
