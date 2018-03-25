package com.callback.rxjava.myfirsttdd;

/**
 * Created by sachin on 24/3/18.
 */

public class MainPresenter implements MainContract.MainPresenter {

    private MainContract.MainView mView;

    MainPresenter(MainContract.MainView view){
        mView = view;
    }

    @Override
    public void handleSignInButtonClick() {
        mView.showSignInScreen();
    }

    @Override
    public void handleSignUpButtonClick() {

    }
}
