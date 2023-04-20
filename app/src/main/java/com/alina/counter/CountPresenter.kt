package com.alina.counter

import android.graphics.Color

class CountPresenter {
    var model = CountModel()
    lateinit var view: CounterView


    fun increment() {
        model.increment()
        view.showCount(model.getCount())
        newFun()

    }


    fun decrement() {
        model.decrement()
        view.showCount(model.getCount())
        newFun()
    }

    private fun newFun() {
        if (model.getCount() == 10) {
            view.showToast("Поздравляем!!!")
        }
        if (model.getCount() == 15) {
            view.setTextColor(Color.GREEN)
        } else {
            view.setTextColor(Color.BLACK)
        }
    }


    fun attachView(viewFromActivity: CounterView) {
        view = viewFromActivity
    }
}