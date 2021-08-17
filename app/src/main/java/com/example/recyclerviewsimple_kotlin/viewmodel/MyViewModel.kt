package com.example.recyclerviewsimple_kotlin.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewsimple_kotlin.model.DataModel
import com.example.recyclerviewsimple_kotlin.repository.DataOfItems

class MyViewModel : ViewModel() {

    //live data
    private var listOfLiveData: MutableLiveData<MutableList<DataModel>> = MutableLiveData()


    var originalList:MutableList<DataModel> = DataOfItems.myItemData()

    init {
        listOfLiveData.value=originalList
        Log.d("list123",listOfLiveData.toString())
    }


    fun getImageMutableLiveData(): MutableLiveData<MutableList<DataModel>> {
        return listOfLiveData
    }


}