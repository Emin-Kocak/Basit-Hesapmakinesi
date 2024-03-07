package com.example.kotlinhesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kotlinhesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var sayi1 : Int? = null
    var sayi2 : Int? = null
    var sonuc : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }

    fun topla(v: View){
        sayi1= binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2= binding.editTextNumber2.text.toString().toIntOrNull()

        if (sayi1 == null){
            binding.textView.text = "birinci sayi girilmedi!!"
        }
        if (sayi2 == null){
            binding.textView.text = "ikinci sayi girilmedi!!"
        }
        else
            sonuc = sayi1!! + sayi2!!
        binding.textView.text= "Sonuc : $sonuc"
    }
    fun cıkar(v:View){
        sayi1= binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2= binding.editTextNumber2.text.toString().toIntOrNull()

        if (sayi1 == null){
            binding.textView.text = "birinci sayi girilmedi!!"
        }
        if (sayi2 == null){
            binding.textView.text = "ikinci sayi girilmedi!!"
        }
        else
            sonuc = sayi1!! - sayi2!!
        binding.textView.text= "Sonuc : $sonuc"
    }
    fun carp(v:View){
        sayi1= binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2= binding.editTextNumber2.text.toString().toIntOrNull()

        if (sayi1 == null){
            binding.textView.text = "birinci sayi girilmedi!!"
        }
        if (sayi2 == null){
            binding.textView.text = "ikinci sayi girilmedi!!"
        }
        else
            sonuc = sayi1!! * sayi2!!
        binding.textView.text= "Sonuc : $sonuc"
    }
    fun bol(v:View){
        sayi1= binding.editTextNumber1.text.toString().toIntOrNull()
        sayi2= binding.editTextNumber2.text.toString().toIntOrNull()

        if (sayi1 == null){
            binding.textView.text = "birinci sayi girilmedi!!"
        }
        if (sayi2 == null){
            binding.textView.text = "ikinci sayi girilmedi!!"
        }
        else
            sonuc = sayi1!! / sayi2!!
        binding.textView.text= "Sonuc : $sonuc"
    }

}