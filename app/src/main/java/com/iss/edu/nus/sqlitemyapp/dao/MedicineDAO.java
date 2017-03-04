package com.iss.edu.nus.sqlitemyapp.dao;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.provider.ContactsContract;
import android.text.style.TtsSpan;
import android.util.Log;

import com.iss.edu.nus.sqlitemyapp.Medicine.Medicine;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;

/**
 * Created by soemayhan on 1/3/17.
 */

public class MedicineDAO extends DBDAO {

    private static final String WHERE_ID_EQUALS = DataBaseHelper.Med_ID + " =?";

    private static final SimpleDateFormat formatter = new SimpleDateFormat("mm-dd-yyyy hh:mm", Locale.ENGLISH);

    public MedicineDAO(Context context) {super(context);}

    public long save(Medicine medicine){
        ContentValues values = new ContentValues();

        values.put(DataBaseHelper.Med_Name, medicine.getMedicine());
        values.put(DataBaseHelper.Med_Des, medicine.getDescription());
        values.put(DataBaseHelper.Med_CatId, medicine.getCatId());
        values.put(DataBaseHelper.Med_RemId, medicine.getReminderId());
        values.put(DataBaseHelper.Med_Reminder, medicine.isReminder());
        values.put(DataBaseHelper.Med_Qty, medicine.getQuantity());
        values.put(DataBaseHelper.Med_Dos, medicine.getDosage());
        values.put(DataBaseHelper.Med_DateIss, formatter.format(medicine.getDateIssued()));

        return database.insert(DataBaseHelper.MEDICINE_TABLE, null, values);
    }

    public long update(Medicine medicine){
        ContentValues values = new ContentValues();
        values.put(DataBaseHelper.Med_Name, medicine.getMedicine());
        values.put(DataBaseHelper.Med_Des, medicine.getDescription());
        values.put(DataBaseHelper.Med_CatId, medicine.getCatId());
        values.put(DataBaseHelper.Med_RemId, medicine.getReminderId());
        values.put(DataBaseHelper.Med_Reminder, medicine.isReminder());
        values.put(DataBaseHelper.Med_Qty, medicine.getQuantity());
        values.put(DataBaseHelper.Med_Dos, medicine.getDosage());
        values.put(DataBaseHelper.Med_DateIss, formatter.format(medicine.getDateIssued()));

        long result = database.update(DataBaseHelper.MEDICINE_TABLE, values, WHERE_ID_EQUALS,
                new String[] { String.valueOf(medicine.getId())});
        Log.d("Update Result:", "=" + result);

        return result;
    }

    public int delete(Medicine medicine){
        return database.delete(DataBaseHelper.MEDICINE_TABLE, WHERE_ID_EQUALS,
                        new String[] {medicine.getId() + ""});
    }
}
