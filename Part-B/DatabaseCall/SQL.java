package com.example.myapplicationb4;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
public class SQL extends SQLiteOpenHelper {
 public static String DB_name="StudentDB";
 public SQL(Context context) {
 super(context, DB_name,null,1);
 }
 @Override
 public void onCreate(SQLiteDatabase db) {
 db.execSQL("create table student(name,usn primary key, phone)");
 }
 @Override
 public void onUpgrade(SQLiteDatabase db, int i, int i1) {
 }
}
