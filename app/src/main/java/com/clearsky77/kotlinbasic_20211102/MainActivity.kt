package com.clearsky77.kotlinbasic_20211102

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLog.setOnClickListener {
            Log.d("메인화면", "로그찍기 버튼이 눌림")
            Log.e("메인화면", "에러")
            Log.w("메인화면", "워닝")
            Log.wtf("메인화면", "이 무슨 이런게!")
        }

        btnToast.setOnClickListener {
            Toast.makeText(this, "둥근 Toast 떴습니~다~♪", Toast.LENGTH_SHORT).show()
        }
        btnToast2.setOnClickListener {
            Toast.makeText(this, "자리에서 일~어나서~♪", Toast.LENGTH_SHORT).show()
        }

        btnCopyText.setOnClickListener {
//            1. 입력칸 내용 가져오기
            val inputContent = edtContent.text.toString()
//            2. 알아낸 텍스트를 복사해서 세팅하기
            txtCopyResult.text = inputContent
        }

        btnContentToast.setOnClickListener {
            val inputContent = edtContent.text.toString()
            Toast.makeText(this, inputContent, Toast.LENGTH_SHORT).show()
        }

    }

}