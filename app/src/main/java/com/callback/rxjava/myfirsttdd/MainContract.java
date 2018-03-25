package com.callback.rxjava.myfirsttdd;

/**
 * Created by sachin on 24/3/18.
 */

public interface MainContract {

    interface MainView {
        void showSignInScreen();
        void showSignUpScreen();
    }

    interface MainPresenter {
        void handleSignInButtonClick();
        void handleSignUpButtonClick();
    }

}
