package com.informatika.firdaushermawan_19100018_kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun tambah(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil = findViewById<TextView>(R.id.tv_hasil)

        if (angkaPertama.equals("")) {
            et_angka_pertama.setError("masukan angka!")
        } else if (angkaKedua.equals("")) {
            et_angka_kedua.setError("masukan angka!")
        } else {
            val jumlah = angkaPertama.toDouble() + angkaKedua.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun kali(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil = findViewById<TextView>(R.id.tv_hasil)

        if (angkaPertama.equals("")) {
            et_angka_pertama.setError("masukan angka!")
        } else if (angkaKedua.equals("")) {
            et_angka_kedua.setError("masukan angka!")
        } else {
            val jumlah = angkaPertama.toDouble() * angkaKedua.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun bagi(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil = findViewById<TextView>(R.id.tv_hasil)

        if (angkaPertama.equals("")) {
            et_angka_pertama.setError("masukan angka!")
        } else if (angkaKedua.equals("")) {
            et_angka_kedua.setError("masukan angka!")
        } else {
            val jumlah = angkaPertama.toDouble() / angkaKedua.toDouble()
            hasil.text = jumlah.toString()
        }
    }

    fun kurang(view: View) {
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.toString()
        val angkaKedua = findViewById<EditText>(R.id.et_angka_kedua).text.toString()
        val hasil = findViewById<TextView>(R.id.tv_hasil)

        if (angkaPertama.equals("")) {
            et_angka_pertama.setError("masukan angka!")
        } else if (angkaKedua.equals("")) {
            et_angka_kedua.setError("masukan angka!")
        } else {
            val jumlah = angkaPertama.toDouble() - angkaKedua.toDouble()
            hasil.text = jumlah.toString()
        }
    }
    fun clear(view: View){
        val angkaPertama = findViewById<EditText>(R.id.et_angka_pertama).text.clear()
        val angkaKedua = findViewById<EditText>(R.id.et_angka_kedua).text.clear()
        var hasil = findViewById<TextView>(R.id.tv_hasil)

        hasil.text = "0"
    }

}