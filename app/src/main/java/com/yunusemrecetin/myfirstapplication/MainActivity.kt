package com.yunusemrecetin.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Değişkenler && Sabitler
        println("---------------Int----------------")
        var a = 5
        var b = 10
        println("a x b : " + a*b)

        var yas = 50
        println("Yas / 5 * 8 : " + yas / 5 * 8)

        yas = 60
        println("Yas / 5 * 8 : " + yas / 5 * 8)

        val piDeger = 3.14 // Değişmesini istemediğimiz sabit bir değer tutacağımız zaman val kullanıyoruz.
        println("Pi Sayisi : " + piDeger)

        val x = 5
        val y = 20
        println(x+y)

        val yasSonucu = yas * x
        println("Yas + x : " + yasSonucu)

        //Tanımlama (Defining)
        val benimIntegerim : Int

        // Başlatma, Değerini Atama (Initializing, Initialization)
        benimIntegerim = 5

        var yeniInteger : Int = 20
        println("benimInteger değerim : " + benimIntegerim / 2)

        //Long
        println("---------------Long----------------")
        var benimLong : Long = 100
        benimLong = 3000000000000
        println("benimLong değerim : " + benimLong)

        //Double & Float
        println("---------------Double & Float----------------")
        var pi = 3.14 // Default Double olduğu için var pi : Double = 3.14 yazmamıza gerek yok.
        println("pi * 2" + pi * 2)
        val floatPi : Float = 3.14f // Float kullanırken değerimizin sonuna 'f' koyuyoruz.
        println("floatPi * 2 :" + floatPi * 2)

        val yeniDouble = 5.0
        println("yeniDouble / 2" + yeniDouble / 2)
    }

}