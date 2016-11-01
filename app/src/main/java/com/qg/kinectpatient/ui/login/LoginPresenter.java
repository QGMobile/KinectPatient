package com.qg.kinectpatient.ui.login;

import com.qg.kinectpatient.logic.LogicHandler;
import com.qg.kinectpatient.logic.LogicImpl;
import com.qg.kinectpatient.param.LoginParam;
import com.qg.kinectpatient.result.LoginResult;
import com.qg.kinectpatient.util.FormatChecker;

import static com.qg.kinectpatient.util.Preconditions.checkNotNull;

/**
 * Created by TZH on 2016/10/27.
 */
public class LoginPresenter implements LoginContract.Presenter {

    private final LoginContract.View mLoginView;

    public LoginPresenter(LoginContract.View loginView) {
        mLoginView = checkNotNull(loginView, "loginView cannot be null!");
        mLoginView.setPresenter(this);
    }

    @Override
    public void start() {
        loadAccount();
    }

    private void loadAccount() {
        boolean isRemembered = true;
        if (isRemembered) {
            mLoginView.setPhone("13549991585");
            mLoginView.setPassword("qgmobile");
        }
    }

    @Override
    public void login(String phone, String password, final boolean rememberPassword) {
        if (!FormatChecker.isMobile(phone) || !FormatChecker.isAcceptablePassword(password)) {
            mLoginView.showInputError();
            return;
        }
        LogicImpl.getInstance().login(new LoginParam(phone, password), new LogicHandler<LoginResult>() {
            @Override
            public void onResult(LoginResult result, boolean onUIThread) {
                if (onUIThread) {
                    if (!mLoginView.isActive()) {
                        return;
                    }
                    if (result.isOk()) {
                        mLoginView.showMain(result.getPUser());
                    } else {
                        mLoginView.showError(result.errMsg);
                    }
                }
            }
        });
    }
}
