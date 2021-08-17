package com.example.recyclerviewsimple_kotlin.repository

import com.example.recyclerviewsimple_kotlin.R
import com.example.recyclerviewsimple_kotlin.model.DataModel

class DataOfItems {

    companion object {
        var list = mutableListOf<DataModel>()
        fun myItemData():MutableList<DataModel>{
            list.add(DataModel(R.drawable.image1, "image1"))
            list.add(DataModel(R.drawable.image2, "image2"))
            list.add(DataModel(R.drawable.image3, "image3"))
            list.add(DataModel(R.drawable.image4, "image4"))
            list.add(DataModel(R.drawable.image5, "image5"))
            list.add(DataModel(R.drawable.image6, "image6"))
            list.add(DataModel(R.drawable.image7, "image7"))
            list.add(DataModel(R.drawable.image8, "image8"))
            list.add(DataModel(R.drawable.image9, "image9"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image1, "image1"))
            list.add(DataModel(R.drawable.image2, "image2"))
            list.add(DataModel(R.drawable.image3, "image3"))
            list.add(DataModel(R.drawable.image4, "image4"))
            list.add(DataModel(R.drawable.image5, "image5"))
            list.add(DataModel(R.drawable.image6, "image6"))
            list.add(DataModel(R.drawable.image7, "image7"))
            list.add(DataModel(R.drawable.image8, "image8"))
            list.add(DataModel(R.drawable.image9, "image9"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image1, "image1"))
            list.add(DataModel(R.drawable.image2, "image2"))
            list.add(DataModel(R.drawable.image3, "image3"))
            list.add(DataModel(R.drawable.image4, "image4"))
            list.add(DataModel(R.drawable.image5, "image5"))
            list.add(DataModel(R.drawable.image6, "image6"))
            list.add(DataModel(R.drawable.image7, "image7"))
            list.add(DataModel(R.drawable.image8, "image8"))
            list.add(DataModel(R.drawable.image9, "image9"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            list.add(DataModel(R.drawable.image10, "image10"))
            return list
        }
    }
}