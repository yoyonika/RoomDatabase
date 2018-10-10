package com.example.android.roomdatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class MyList {
        @PrimaryKey (autoGenerate = true)
        private int listId;

        @ColumnInfo(name = "list_of_items")
        private String listOfItems;

        public MyList(int listId, String listOfItems) {
                this.listId = listId;
                this.listOfItems = listOfItems;
        }

        //setters

        public void setListId(int listId) {
                this.listId = listId;
        }

        public void setListOfItems(String listOfItems) {
                this.listOfItems = listOfItems;
        }

        //getters

        public int getListId() {
                return listId;
        }

        public String getListOfItems() {
                return listOfItems;
        }

}
