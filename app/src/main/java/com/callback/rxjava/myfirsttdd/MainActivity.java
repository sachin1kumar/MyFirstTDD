package com.callback.rxjava.myfirsttdd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainContract.MainView{

    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);
    }

    @Override
    public void showSignInScreen() {

    }

    @Override
    public void showSignUpScreen() {

    }
}
