package com.rb.simplemvvm.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.rb.simplemvvm.model.Person;

@Database(entities = {Person.class} , version = 1)
public abstract class PersonRoomDatabase extends RoomDatabase {

    public abstract PersonDao personDao();


    private static PersonRoomDatabase INSTANCE;

    public static PersonRoomDatabase getDatabase (final Context context){
        if (INSTANCE == null) {
            synchronized (PersonRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PersonRoomDatabase.class,"persons_database")
                            .fallbackToDestructiveMigration()
                            .build();
                }}}
                return INSTANCE;
    }
}
