package com.example.adrey.newbasemvp.base.presenter

import com.example.adrey.newbasemvp.base.interactor.MVPInteractor
import com.example.adrey.newbasemvp.base.view.MVPView

abstract class BasePresenter<V: MVPView, I: MVPInteractor>
constructor(protected var interactor: I): MVPPresenter<V, I> {

    private var view: V? = null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun onDetach() {
        view = null
    }

    override fun getView(): V? = view
}