package com.uty.responsi_090

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uty.responsi_090.ListHomeAdapter
import com.uty.responsi_090.model.home
import com.uty.responsi_090.model.homedata


class HomeActivity : AppCompatActivity() {
    private lateinit var rvPresident: RecyclerView
    private var list: ArrayList<home> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        rvPresident= findViewById(R.id.rv_president)
        rvPresident.setHasFixedSize(true)
        list.addAll(homedata.listPresident)
        showPresidentList()
    }
    private fun showPresidentList() {
        rvPresident.layoutManager = LinearLayoutManager(this)
        val listHomeAdapter = ListHomeAdapter(list)
        rvPresident.adapter = listHomeAdapter
        }


}
