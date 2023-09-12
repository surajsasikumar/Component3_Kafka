package com.nodemngmt.entity

import io.micronaut.serde.annotation.Serdeable
import jakarta.persistence.*

@Entity
@Serdeable
@Table(name="package_dimensions_entity")
data class PackageDimensions(
    @Id
    @Column(name="tcin")
    var tcin: String,
    @Column(name="depth")
    var depth:Double,
    @Column(name="height")
    var height: Double,
    @Column(name="units")
    var units: String,
    @Column(name="width")
    var width:Double,
    @Column(name="code")
    var code :String,
    @Column(name="value")
    var value:Double
){
    constructor(): this("",2.00,4.00,"",3.00,"",6.00)
}