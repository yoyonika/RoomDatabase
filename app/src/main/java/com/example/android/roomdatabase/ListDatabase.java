package com.example.android.roomdatabase;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {MyList.class}, version = 1)
public abstract class ListDatabase extends RoomDatabase {
    public abstract ListDao getlistDao();
    public static ListDatabase listDatabase;
}
