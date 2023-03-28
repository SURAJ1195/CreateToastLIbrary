package com.example.createtoastlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toastlib.ToastShow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToastShow.showToast(this,"suraj kumar")
    }
}