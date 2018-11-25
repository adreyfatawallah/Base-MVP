package com.example.adrey.newbasemvp.ui.interactor

import com.example.adrey.newbasemvp.base.interactor.BaseInteractor

class MainInteractor : BaseInteractor(), MainMVPInteractor {

    // Send parameter to request API and request
    // return is model API
    override fun doLogin(username: String, password: String): String {
        println("Request to Login")
        return "Request to Login"
    }
}