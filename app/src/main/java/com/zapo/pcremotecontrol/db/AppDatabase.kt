package com.zapo.pcremotecontrol.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.zapo.pcremotecontrol.BuildConfig
import com.zapo.pcremotecontrol.db.dao.PcDao
import com.zapo.pcremotecontrol.db.entity.PcEntity

@Database(
    entities = arrayOf(
        PcEntity::class
    ),
    version = BuildConfig.DB_VERSION
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun pc(): PcDao

}