package com.robin.usecases

import com.robin.data.TabletoppersRepository
import com.robin.domain.Gezelschapsspel

class GetGezelschapsspel(private val tabletoppersRepository: TabletoppersRepository)/*: Parcelable*/ {

    operator fun invoke(id: Long): Gezelschapsspel? = tabletoppersRepository.getGezelschapsspel(id)

}