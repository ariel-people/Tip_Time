package com.example.tiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tipCalculator(view: View){
        if(view is RadioButton){
            val checked = view.isChecked

            when (view.getId()){
                R.id.tip_twenty -> if (checked){
                    val discountPercent = 20
                }
                R.id.tip_eighteen -> if (checked){
                    val discountPercent = 18
                }
                R.id.tip_fifteen -> if (checked){
                    val discountPercent = 15
                }
            }
        }
    }

}