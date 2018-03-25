package com.callback.rxjava.myfirsttdd;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

/**
 * Created by sachin on 24/3/18.
 */
public class MainPresenterTest {

    @Mock
    private MainContract.MainView mView;

    private MainPresenter mPresenter;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);

        mPresenter = new MainPresenter(mView);
    }

    @Test
    public void handleSignInButtonClick() throws Exception {
        mPresenter.handleSignInButtonClick();
        verify(mView).showSignInScreen();
    }

    @Test
    public void handleSignUpButtonClick() throws Exception {
        mPresenter.handleSignUpButtonClick();
        verify(mView).showSignUpScreen();
    }

}