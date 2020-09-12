package com.google.eyad.newsapi.db

import androidx.room.TypeConverter
import com.google.eyad.newsapi.models.Source

class Converters {

    @TypeConverter
    fun fromsource(source: Source) :String {
    return source.name
    }

    @TypeConverter
    fun toSource (name:String) : Source {
        return Source(name , name )

    }
}