package com.example.myapplicationcalculadora_simples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Calculadora{
    fun Somar(n1 : Int, n2: Int): Int{
        var soma = n1 + n2
        return(soma)
    }
    fun Subtrair(n1 : Int, n2: Int): Int{
        var subtrair = n1 - n2
        return(subtrair)
    }
    fun Multiplicar(n1 : Int, n2: Int): Int{
        var multiplicar = n1 * n2
        return(multiplicar)
    }
    fun Dividir(n1 : Int, n2: Int): Int{
        var dividir = n1 / n2
        return(dividir)
    }
}