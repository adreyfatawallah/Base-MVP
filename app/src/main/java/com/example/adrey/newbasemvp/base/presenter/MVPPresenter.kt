package com.example.adrey.newbasemvp.base.presenter

import com.example.adrey.newbasemvp.base.interactor.MVPInteractor
import com.example.adrey.newbasemvp.base.view.MVPView

interface MVPPresenter<V: MVPView, I: MVPInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?
}