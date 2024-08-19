package com.appsqueeze.final_lib

import android.content.Context
import android.widget.Toast

class ToastCustom {
    fun showToast(context: Context, message: String){
        val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
        toast.show()

    }
}