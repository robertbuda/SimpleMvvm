package com.rb.simplemvvm.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "table_persons")
public class Person {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "person_id")
    private int personId;

    @ColumnInfo(name = "person_first_name")
    private String personFirstName;

    @ColumnInfo(name = "person_second_name")
    private String personSecondName;

    public Person(@NonNull int personId, String personFirstName, String personSecondName) {
        this.personId = personId;
        this.personFirstName = personFirstName;
        this.personSecondName = personSecondName;
    }

    @NonNull
    public int getPersonId() {
        return personId;
    }

    public String getPersonFirstName() {
        return personFirstName;
    }

    public String getPersonSecondName() {
        return personSecondName;
    }
}
