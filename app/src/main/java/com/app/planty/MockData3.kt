package com.app.plantstoreapp


import com.app.planty.Plant
import com.app.planty.R

object MockData3 {
    fun catergoryplants():MutableList<Plant>{
        val category= mutableListOf<Plant>()

        for ( i in 0 until 1){
         val plant1=Plant("Aglaonema","$45", R.drawable.image1,"Small","","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
         val plant2=Plant("Amber Plant","$15",R.drawable.image2,"Medium","Plant","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
         val plant3=Plant("Kaktus Pus","$35",R.drawable.image6,"Large","Plant","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
         val plant4=Plant("Arecaceae","$25",R.drawable.image3,"Small","Plant","Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged")
//         val plant4=Plant("Aglaonema","45","","","","")
//         val plant5=Plant("Aglaonema","45","","","","")

            category.add(plant1)
            category.add(plant2)
            category.add(plant3)
            category.add(plant4)
//            category.add(plant4)
//            category.add(plant5)

        }
        return category

    }
}