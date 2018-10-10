package com.example.android.roomdatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface ListDao {

        @Query("SELECT * FROM MyList")
        List<MyList> getAll();

        @Insert
        void insertAll(MyList... myLists);

        @Update
        void updateAll (MyList mylist);

        @Delete
        void delete (MyList myList);

}
