package com.example.synrgy_intentfragment

import android.os.Parcel
import android.os.Parcelable

class PersonParcel(val nama: String?, val umur:Int) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readInt()
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nama)
        parcel.writeInt(umur)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PersonParcel> {
        override fun createFromParcel(parcel: Parcel): PersonParcel {
            return PersonParcel(parcel)
        }

        override fun newArray(size: Int): Array<PersonParcel?> {
            return arrayOfNulls(size)
        }
    }
}