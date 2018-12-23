package com.robin.usecases

import com.robin.data.GezelschapsspelRepository
import com.robin.domain.Gezelschapsspel
//import kotlinx.android.parcel.Parcelize

//@Parcelize
class GetGezelschapsspelen(private val gezelschapsspelRepository: GezelschapsspelRepository)/*: Parcelable*/ {

    operator fun invoke(): List<Gezelschapsspel> = gezelschapsspelRepository.getGezelschapsspelen()

}
