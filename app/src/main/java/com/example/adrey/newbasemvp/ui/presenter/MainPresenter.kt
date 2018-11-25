package com.example.adrey.newbasemvp.ui.presenter

import android.os.Handler
import android.text.TextUtils
import com.example.adrey.newbasemvp.base.presenter.BasePresenter
import com.example.adrey.newbasemvp.ui.interactor.MainMVPInteractor
import com.example.adrey.newbasemvp.ui.view.MainMVPView

class MainPresenter<V: MainMVPView, I: MainMVPInteractor> constructor(interactor: I) :
        BasePresenter<V, I>(interactor = interactor), MainMVPPresenter<V, I> {

    override fun onLogin(username: String, password: String) {
        when {
            username.isEmpty() -> getView()?.setUsernameError()
            password.isEmpty() -> getView()?.setPasswordError()
            else -> interactor.let {
                getView()?.showProgressView()
                // Request to API and set method view to execute
                Handler().postDelayed({
                    when {
                        TextUtils.isEmpty(username) -> getView()?.setUsernameError()
                        TextUtils.isEmpty(password) -> getView()?.setPasswordError()
                        else -> {
                            interactor.doLogin(username, password)
                            if (username == password)
                                onLoginSuccess()
                            else
                                onLoginError()
                        }
                    }
                }, 2000)
            }
        }
    }

    override fun onUsernameError() {
        getView()?.setUsernameError()
    }

    override fun onPasswordError() {
        getView()?.setPasswordError()
    }

    override fun onLoginSuccess() {
        getView()?.hideProgressView()
        getView()?.showLoginSuccess()
    }

    override fun onLoginError() {
        getView()?.hideProgressView()
        getView()?.showLoginError()
    }
}