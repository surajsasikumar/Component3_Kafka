package com.nodemngmt.controller

import com.nodemngmt.entity.PackageDimensions
import com.nodemngmt.service.PackageDimensionsService
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Put

@Controller("/component3")
class PackageDimensionController(private val packageDimensionsService:PackageDimensionsService) {
    @Put("/updateCompliance")
    fun updateCompliance(packageDimensions: PackageDimensions):PackageDimensions{
        return packageDimensionsService.updateDimensions(packageDimensions)
    }
}