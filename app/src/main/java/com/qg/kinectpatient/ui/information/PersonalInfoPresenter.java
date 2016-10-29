package com.qg.kinectpatient.ui.information;

import android.support.annotation.NonNull;

import static com.qg.kinectpatient.util.Preconditions.checkNotNull;

/**
 * Created by TZH on 2016/10/29.
 */

class PersonalInfoPresenter implements PersonalInfoContract.Presenter {
    private PersonalInfoContract.View mView;
    private int mDoctorId;

    PersonalInfoPresenter(int patientId, @NonNull PersonalInfoContract.View view) {
        mDoctorId = patientId;
        mView = checkNotNull(view);
        mView.setPresenter(this);
    }

    @Override
    public void start() {
        loadInfo(mDoctorId);
    }

    private void loadInfo(int patientId) {

    }

    @Override
    public void baseInfo() {
        mView.showBaseInfo(mDoctorId);
    }

    public void manageAccount() {
        mView.showAccountManage(mDoctorId);
    }

}
