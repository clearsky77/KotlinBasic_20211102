package com.clearsky77.kotlinbasic_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLog.setOnClickListener {
            Log.d("메인화면","로그찍기 버튼이 눌림")
            Log.e("메인화면","에러")
            Log.w("메인화면","워닝")
            Log.wtf("메인화면","이 무슨 이런게!")
        }
    }

}