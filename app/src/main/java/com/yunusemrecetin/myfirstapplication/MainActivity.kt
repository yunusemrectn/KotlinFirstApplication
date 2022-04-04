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

        //String - Metin
        println("---------------String----------------")
        val benimString = "Benim Yeni Metnim"
        println("benimString içerisinde yazan metnin uzunluğu : " + benimString.length)

        val isim = "Yunus Emre"
        val soyisim = "ÇETİN"

        val tamisim = isim + " " + soyisim
        println("isim + soyisim : " + tamisim)

        val yeniBirString : String
        yeniBirString = "10"
        val baskaBirString : String
        baskaBirString = "20"
        println("yeniBirString+baskaBirString : " + yeniBirString+baskaBirString)

        //Boolean
        println("---------------Boolean----------------")
        var benimBoolean = true
        benimBoolean = false

        println(3<5)
        println(4!=4)

        //Veri Tipi Dönüştürme
        println("---------------Dönüştürme----------------")
        val benimInt = 10
        val benimLongaCevrilenInt = benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi = "50"
        val kullaniciInt = kullaniciGirdisi.toInt()
        println("KullaniciGirdisi / 2" + kullaniciInt / 2)

        //Koleksiyonlar
        //Array - Dizi
        println("---------------Dizi----------------")
        val stringOrnegi = "Yunus Emre"
        val benimDizim = arrayOf(stringOrnegi,"Çetin","Hüseyin","Batuhan","Furkan")
        //index
        println(benimDizim[0]);
        println(benimDizim.get(1));
        println(benimDizim.get(2));
        benimDizim[2] = "Tunçkan"
        println(benimDizim.get(2));
        benimDizim.set(3,"Eren")
        println(benimDizim.get(3))

        val numaraDizisi = intArrayOf(1,2,3,4,5)
        println(numaraDizisi.get(2))

        val karisikDizi = arrayOf("Yunus Emre",10,15.7,false)
        println(karisikDizi.get(3))

        //ArrayList - Listeler
        println("---------------ArrayList----------------")
        val isimListesi = arrayListOf("Yunus Emre","Hüseyin","Batuhan","Furkan")
        println(isimListesi[0])
        println(isimListesi.get(1))

        isimListesi.add("Tunçkan")
        isimListesi.add("Atlas")
        println(isimListesi.get(4))

        val karisikArrayList = arrayListOf<Any>()
        karisikArrayList.add(3)
        karisikArrayList.add("Yunus")
        karisikArrayList.add(true)

        val intArrayList = ArrayList<Int>()
        intArrayList.add(5)
        intArrayList.add(20)
        println(intArrayList.get(1))

        //Set
        println("---------------Set----------------")

        val ornekDizi = arrayOf(7,8,9,9,9,8,10)
        println("index 2: ${ornekDizi[2]} ")
        println("index 2: ${ornekDizi[3]} ")

        println(ornekDizi.size)

        val benimSet = setOf<Int>(7,8,9,9,9,8,10)
        println(benimSet.size)
        //For Each
        benimSet.forEach {
            println(it)
        }
        val digerSet = HashSet<String>()
        digerSet.add("Yunus")
        digerSet.add("Yunus")
        digerSet.add("Yunus")
        digerSet.add("Emre")
        digerSet.forEach {
            println(it)
        }

        //Map
        println("---------------Map----------------")

        //Anahtar Kelime - Değer (Key-Value Pairing)

        val yemekDizisi = arrayOf("Elma","Et","Tavuk")
        val kaloriDizisi = arrayOf(100,300,200)

        println("${yemekDizisi[0]}'nın kalorisi : ${kaloriDizisi[0]}")

        val yemekKaloriMap = hashMapOf<String,Int>()
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)

        println(yemekKaloriMap.get("Et"))

        val benimMapim = hashMapOf<String, String>()
        benimMapim.put("Örnek","Değer");

        val yeniMap = hashMapOf<String, Int>("Yunus" to 40, "Emre" to 50)
        println(yeniMap.get("Emre"));




    }

}