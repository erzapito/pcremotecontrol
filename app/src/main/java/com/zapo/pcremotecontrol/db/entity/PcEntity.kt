package com.zapo.pcremotecontrol.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pc")
data class PcEntity (

    @PrimaryKey
    var id : Long?,
    var name: String?,
    var ip: String?

)