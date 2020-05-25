package com.example.matdes6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var resView:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       initView()
    }

    fun initList():List<RecyclerData>{
        val list:MutableList<RecyclerData> = ArrayList()

        list.add(RecyclerData("Клубника"))
        list.add(RecyclerData("Виноград"))
        list.add(RecyclerData("Киви"))
        list.add(RecyclerData("Апельсин"))
        list.add(RecyclerData("Персик"))
        list.add(RecyclerData("Лимон"))
        list.add(RecyclerData("Авокадо"))
        list.add(RecyclerData("Крыжовник"))
        list.add(RecyclerData("Смородина"))
        list.add(RecyclerData("Черника"))
        list.add(RecyclerData("Банан"))
        list.add(RecyclerData("Вишня"))
        return list
    }

    fun initView(){
        resView = findViewById(R.id.recycler_view)
        resView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        resView.adapter = MyRecyclerAdapter(initList())
    }
}
