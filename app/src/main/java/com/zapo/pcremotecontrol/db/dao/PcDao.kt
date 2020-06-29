package com.zapo.pcremotecontrol.db.dao

import androidx.room.Dao
import androidx.room.Insert
import com.zapo.pcremotecontrol.db.entity.PcEntity

@Dao
abstract class PcDao {

    @Insert
    abstract fun insert(pc : PcEntity);

}