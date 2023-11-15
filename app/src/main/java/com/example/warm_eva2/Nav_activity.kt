package com.example.warm_eva2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.warm_eva2.databinding.ActivityMainBinding
import com.example.warm_eva2.databinding.ActivityNavBinding
import com.example.warm_eva2.vistas.DispositivosFragment
import com.example.warm_eva2.vistas.MedirFragment
import com.example.warm_eva2.vistas.SalirFragment


class Nav_activity : AppCompatActivity() {

    private lateinit var binding: ActivityNavBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNavBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.nav_medir -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,MedirFragment()).commit()
                    true
                }
                R.id.nav_dispositivos -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,DispositivosFragment()).commit()
                    true
                }
                R.id.nav_salir -> {

                    supportFragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,SalirFragment()).commit()
                    true
                }
                else -> false
            }
        }
    }
}

