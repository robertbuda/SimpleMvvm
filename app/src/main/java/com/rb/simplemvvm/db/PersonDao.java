package com.rb.simplemvvm.db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import com.rb.simplemvvm.model.Person;

import java.util.List;

@Dao
public interface PersonDao {

    @Query("SELECT * FROM table_persons ORDER BY person_id")
    LiveData <List<Person>> getAllPersons();

    @Insert
    void insertPerson (Person person);

    @Delete
    void deletePerson (Person person);

    @Query("DELETE FROM table_persons")
    void deleteAllPersons();
}
