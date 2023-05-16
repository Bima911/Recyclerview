package com.bimarandy.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bimarandy.recyclerview.adapter.AdapterTemBola
import com.bimarandy.recyclerview.databinding.ActivityMainBinding
import com.bimarandy.recyclerview.model.Pemain

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPemain = ArrayList<Pemain>()
        listPemain.add(Pemain( "Alisson Ramses Becker", R.drawable.Alisson, "Alisson", "Oct 2, 1992", "Novo Hamburgo, Brazil", "30", "1,93 m", "Goalkeeper"))

        binding.list.adapter = AdapterTemBola(this, listPemain,object : AdapterTemBola.OnClickListener{
            override fun detailData(item: Pemain?) {
                TODO("Not yet implemented")
            }

        })
    }
}