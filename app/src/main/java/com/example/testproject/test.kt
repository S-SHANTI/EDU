package com.example.testproject

import android.content.Context

class test(val context:Context){
    fun getPackageName():String {
        return context.packageName
    }
}