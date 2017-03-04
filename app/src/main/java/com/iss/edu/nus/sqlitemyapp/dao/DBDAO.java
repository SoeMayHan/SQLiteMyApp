package com.iss.edu.nus.sqlitemyapp.dao;

import android.app.admin.DeviceAdminInfo;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

/**
 * Created by soemayhan on 1/3/17.
 */

public class DBDAO {
    protected SQLiteDatabase database;
    private DataBaseHelper dbHelper;
    private Context mcontext;

    public DBDAO(Context context){
        this.mcontext = context;
        dbHelper = DataBaseHelper.getHelper(mcontext);
        open();
    }

    public void open() throws SQLException{
        if(dbHelper == null)
            dbHelper = DataBaseHelper.getHelper(mcontext);
        database = dbHelper.getWritableDatabase();
    }

    public void close(){
        dbHelper.close();
        database = null;
    }
}
