package com.example.toastlib

import android.content.Context
import android.widget.Toast

class ToastShow {
    companion object{
        fun showToast(context: Context,msg:String){
            Toast.makeText(context,msg,Toast.LENGTH_LONG).show()
        }
    }
}