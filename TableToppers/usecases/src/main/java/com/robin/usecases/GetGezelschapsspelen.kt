package com.robin.usecases

import com.robin.data.TabletoppersRepository
import com.robin.domain.Gezelschapsspel
import javax.inject.Inject

//import kotlinx.android.parcel.Parcelize

//@Parcelize
class GetGezelschapsspelen()/*: Parcelable*/ {

    @Inject
    private lateinit var tabletoppersRepository: TabletoppersRepository
    operator fun invoke(): List<Gezelschapsspel> = tabletoppersRepository.getGezelschapsspelen()

}
