package com.sriwahyuni.latihan6.model

import com.sriwahyuni.latihan6.R

data class ModelBuah(
    val image: Int,
    val judul: String
)

// kita bikin array
//new*
object MockList {
    //    new*
    fun getModel(): List<ModelBuah> {
        val item1 = ModelBuah(
            R.drawable.apple,
            "apple"
        )
        val item2 = ModelBuah(
            R.drawable.grapes,
            "grapes"
        )
        val item3 = ModelBuah(
            R.drawable.orange,
            "orange"
        )
        val item4 = ModelBuah(
            R.drawable.pear,
            "pear"
        )
        val item5 = ModelBuah(
            R.drawable.strawberry,
            "strawberry"
        )
        val item6 = ModelBuah(
            R.drawable.apple,
            "apple"
        )

        val itemList: ArrayList<ModelBuah> = ArrayList()
        itemList.add(item1)
        itemList.add(item2)
        itemList.add(item3)
        itemList.add(item4)
        itemList.add(item5)
        itemList.add(item6)
        return itemList

    }


}

