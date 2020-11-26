package com.app.planty

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Plant(
    var name:String,
    var price:String,
    var image:Int,
    var size:String?,
    var family:String?,
    var desc:String?
) :Parcelable
