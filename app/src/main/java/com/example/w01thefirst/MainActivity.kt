package com.example.w01thefirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w01thefirst.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0 // 바로 초기화하면 : int 라고 적지 않아도 됨
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)
        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            main.numText.text = "${++count}"
//            val t = main.numText.text.toString().toInt()
//            if (t != null) main.numText.text = (t!! + 1).toString()
        }

        main.btnSub.setOnClickListener{
            if (count > 0){
                main.numText.text = "${--count}"
            }
        }

        main.btnInit.setOnClickListener{
            main.numText.text = "0"
            count = 0
        }

    }
}