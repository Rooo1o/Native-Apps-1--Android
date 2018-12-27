package com.robin.usecases

import com.robin.data.GezelschapsspelRepository
import com.robin.domain.Gezelschapsspel

class GetGezelschapsspel(private val gezelschapsspelRepository: GezelschapsspelRepository)/*: Parcelable*/ {

    operator fun invoke(id: Long): Gezelschapsspel? = gezelschapsspelRepository.getGezelschapsspel(id)

}