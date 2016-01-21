package com.coolweather.app.db;
/*
 *建立数据库：省市县的表
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Administrator on 2016/1/21.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    /*
     *省的建表语句
     */
    public static final String CREATE_PROVINCE = "create table Province (" +
            "id integer primary key autoincrement,"
            +"province_name text,"+
            "province_code text)";
    /*
    市的建表语句
     */
    public static final String CREATE_CITY = "create table City("
            +"id integer primary key autoincrement,"+
            "city_name text," +
            "city_code text" +
            "province_id integer)";
    /*
    县的建表语句
     */
    public static final String CREATE_COUNTY = "create tabel County" +
            "id integer primary key autoincrement," +
            "county_name text," +
            "county_code text," +
            "city_id integer)";



    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);//创建省表
        db.execSQL(CREATE_CITY);//创建市表
        db.execSQL(CREATE_COUNTY);//创建县表
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}
