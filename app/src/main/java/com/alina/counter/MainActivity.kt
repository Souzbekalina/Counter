package com.alina.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alina.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), CounterView {
    lateinit var binding: ActivityMainBinding
    var count = 0
    val presenter = CountPresenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClickers()
        presenter.attachView(this)
    }

    private fun initClickers() {
        with(binding) {
            btnInc.setOnClickListener {
                presenter.increment()
            }
            btnDic.setOnClickListener {
                presenter.decrement()
            }

        }

    }

    override fun showCount(count: Int) {
        binding.tvCount.text = count.toString()
    }

    override fun showToast(msg: String) {
        val toast = Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun setTextColor(color: Int) {
        binding.tvCount.setTextColor(color)
    }
}