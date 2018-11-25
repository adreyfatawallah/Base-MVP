package com.example.adrey.newbasemvp.ui.view

import android.os.Bundle
import android.widget.Toast
import com.example.adrey.newbasemvp.R
import com.example.adrey.newbasemvp.base.view.BaseActivity
import com.example.adrey.newbasemvp.ui.interactor.MainInteractor
import com.example.adrey.newbasemvp.ui.interactor.MainMVPInteractor
import com.example.adrey.newbasemvp.ui.presenter.MainMVPPresenter
import com.example.adrey.newbasemvp.ui.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainMVPView {

    lateinit var presenter: MainMVPPresenter<MainMVPView, MainMVPInteractor>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(MainInteractor())
        presenter.onAttach(this)

        bt_login.setOnClickListener {
            presenter.onLogin(ed_username.text.toString(), ed_password.text.toString())
        }
    }

    override fun setUsernameError() {
        ed_username.error = "Username not valid"
    }

    override fun setPasswordError() {
        ed_password.error = "Password not valid"
    }

    override fun showLoginError() {
        Toast.makeText(this, "Username and Password not same", Toast.LENGTH_SHORT).show()
    }

    override fun showLoginSuccess() {
        Toast.makeText(this, "Show Home Activity", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        presenter.onDetach()
    }
}
