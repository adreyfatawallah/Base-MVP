package com.example.adrey.newbasemvp.base.view

import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

abstract class BaseActivity : AppCompatActivity(), MVPView {

    override fun showProgressView() {
        progressBar.visibility = View.VISIBLE
        ll_form.visibility = View.GONE
    }

    override fun hideProgressView() {
        progressBar.visibility = View.GONE
        ll_form.visibility = View.VISIBLE
    }
}