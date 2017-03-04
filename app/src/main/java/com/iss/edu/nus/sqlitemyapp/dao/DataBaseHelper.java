package com.iss.edu.nus.sqlitemyapp.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by soemayhan on 1/3/17.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "Medipal";
    private static final int DATABASE_VERSION = 1;

    public static final String MEDICINE_TABLE = " Medicine";
    public static final String Med_ID = "ID";
    public static final String Med_Name = "Medicine";
    public static final String Med_Des = "Description";
    public static final String Med_CatId = "CatID";
    public static final String Med_RemId = "ReminderID";
    public static final String Med_Reminder = "Reminder";
    public static final String Med_Qty = "Quantity";
    public static final String Med_Dos = "Dosage";
    public static final String Med_DateIss = "DateIssued";
    public static final String Med_ConQty  = "ConsumeQuality";
    public static final String Med_Threshold = "Threshold";

    public static final String CREATE_MEDICINE_TABLE = "CREATE TABLE "
            + MEDICINE_TABLE + "(" + Med_ID + " INTEGER PRIMARY KEY AUTOINCREATE NOT NULL, "
            + Med_Name + " VARCHAR(50), " + Med_Des + " VARCHAR(255), " + Med_CatId + " INTEGER, "
            + Med_RemId +  " INTEGER, " + Med_Reminder +" BOOLEAN, " + Med_Qty + " INTEGER, " + Med_Dos + " INTEGER, "
            + Med_DateIss + " DATE, " + Med_ConQty + " INTEGER, " + Med_Threshold + " INTEGER" + ")";


    private static DataBaseHelper instance;

    public static synchronized DataBaseHelper getHelper(Context context){
        if(instance == null)
            instance = new DataBaseHelper(context);

        return instance;
    }

    private DataBaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onOpen(SQLiteDatabase db) { super.onOpen(db);}

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_MEDICINE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        Log.w(DataBaseHelper.class.getName(), "Upgrading database from version"
                + oldVersion + " to" + newVersion + ", which will destroy all old data");

        db.execSQL("DROP TABLE IF EXISTS " + MEDICINE_TABLE);
        onCreate(db);
    }

}
