package com.google.eyad.newsapi.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.google.eyad.newsapi.models.Article

@Database(
    entities = [Article::class] ,
    version = 1
)
@TypeConverters(Converters::class)
abstract class ArticalDataBase :RoomDatabase() {

    abstract fun getArticleDao():ArticalDao

    companion object{
        @Volatile
        private var instance :ArticalDataBase?=null
        private val LOCK = Any()

        operator fun invoke(context:Context) = instance ?: synchronized(LOCK){
            instance ?: createDatabase(context).also{ instance = it}
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext ,
                ArticalDataBase::class.java ,
                "artical_db.db"
            ).build()

    }

}