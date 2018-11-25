package com.example.adrey.newbasemvp.ui.presenter

import com.example.adrey.newbasemvp.base.presenter.MVPPresenter
import com.example.adrey.newbasemvp.ui.interactor.MainMVPInteractor
import com.example.adrey.newbasemvp.ui.view.MainMVPView

interface MainMVPPresenter<V: MainMVPView, I: MainMVPInteractor> : MVPPresenter<V, I> {

    fun onLogin(username: String, password: String)

    fun onUsernameError()

    fun onPasswordError()

    fun onLoginSuccess()

    fun onLoginError()
}