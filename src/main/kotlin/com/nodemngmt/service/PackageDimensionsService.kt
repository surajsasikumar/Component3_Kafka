package com.nodemngmt.service

import com.nodemngmt.entity.PackageDimensions
import com.nodemngmt.repository.DimensionsRepository
import io.micronaut.transaction.annotation.Transactional
import jakarta.inject.Singleton

@Singleton
@Transactional
class PackageDimensionsService (private val dimensionRepository: DimensionsRepository){
    fun updateDimensions(packageDimensions: PackageDimensions):PackageDimensions{
        var optionalEntity =dimensionRepository.findById(packageDimensions.tcin)
        if (optionalEntity.isPresent) {
            val entity = optionalEntity.get()
            entity.depth = packageDimensions.depth
            entity.code = packageDimensions.code
            entity.height = packageDimensions.height
            entity.units = packageDimensions.units
            entity.value = packageDimensions.value
            entity.width = packageDimensions.width
            return dimensionRepository.update(entity)
        }
        return dimensionRepository.save(packageDimensions)
    }
}