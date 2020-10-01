package com.example.nicknamegeneradorpro1.ui;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import com.example.nicknamegeneradorpro1.model.Text;

public class DBManager extends SQLiteOpenHelper {

    String TEXT = "CREATE TABLE TEXT("+
            "CONTENT TEXT)";


    public DBManager(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addText(Text text){

    }
}
