package com.example.adrey.newbasemvp.ui.view

import com.example.adrey.newbasemvp.base.view.MVPView

interface MainMVPView : MVPView {

    fun setUsernameError()

    fun setPasswordError()

    fun showLoginError()

    fun showLoginSuccess()
}