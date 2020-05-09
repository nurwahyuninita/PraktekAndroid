package com.praktekandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_hitung.*

class HitungActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        buttonHitung.setOnClickListener {
            var isEmptyfield = false

            val stringPanjang =editPanjang.text.toString().trim()
            val stringLebar =editLebar.text.toString().trim()
            val stringTinggi =editTinggi.text.toString().trim()

            if (stringPanjang.equals("")){
                isEmptyfield =true
                editPanjang.error ="Data Kosong"
            }

            if (stringLebar.isEmpty()){
                isEmptyfield =true
                editLebar.error ="Data Kosong"
            }

            if (stringTinggi == ""){
                isEmptyfield =true
                editTinggi.error ="Data Kosong"
            }

            if (isEmptyfield) {

                val panjang = stringPanjang.toFloat()
                val lebar = stringLebar.toFloat()
                val tinggi = stringTinggi.toFloat()

                textHasil = (panjang * lebar * tinggi).toString()
        }
    }
}
