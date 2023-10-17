package com.example.core.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.core.data.source.local.entity.SekolahEntity

@Database(entities = [SekolahEntity::class], version = 1, exportSchema = false)
abstract class SekolahDatabase: RoomDatabase() {
    abstract fun sekolahDao(
    ): SekolahDao
}