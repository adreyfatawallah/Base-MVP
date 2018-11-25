package com.example.adrey.newbasemvp.ui.interactor

import com.example.adrey.newbasemvp.base.interactor.MVPInteractor

interface MainMVPInteractor : MVPInteractor {

    fun doLogin(username: String, password: String) : String
}