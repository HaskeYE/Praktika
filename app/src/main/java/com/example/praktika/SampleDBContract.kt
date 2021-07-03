package com.example.praktika

import android.provider.BaseColumns


class SampleDBContract private constructor() {
    object Car : BaseColumns {
        const val TABLE_NAME = "car"
        const val COLUMN_NAME = "name of the car"
        const val COLUMN_TYPE = "type of the car"
        const val COLUMN_DESCRIPTION = "description"
        const val COLUMN_PRODUCE_YEAR = "date"
        const val CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " +
                TABLE_NAME + " (" +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_TYPE + " TEXT, " +
                COLUMN_DESCRIPTION + " TEXT, " +
                COLUMN_PRODUCE_YEAR + " INTEGER" + ")"
    }
}