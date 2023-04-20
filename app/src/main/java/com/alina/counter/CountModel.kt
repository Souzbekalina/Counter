package com.alina.counter

class CountModel {
   private var count =0
    fun increment(){
        count++
    }
    fun decrement(){
        count--
    }
    fun getCount():Int{
        return count
    }
}