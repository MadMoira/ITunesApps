package com.example.mirag.gravilitytechnical;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

class DatabaseManager extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_NAME = "applefeed.db";
    private static final String TEXT_TYPE = " TEXT";
    private static final String NUMBER_TYPE = " INTEGER";
    private static final String COMMA_SEP = ",";

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + DatabaseManagerApp.AppEntry.TABLE_NAME + " (" +
                    DatabaseManagerApp.AppEntry._ID + " INTEGER PRIMARY KEY," +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_APP_ID + NUMBER_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_NAME + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_SUMMARY + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_PRICE_VALUE + NUMBER_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_PRICE_CURRENCY + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_TITLE + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_CATEGORY + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_RELEASE_DATE + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_IMAGE_1 + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_IMAGE_2 + TEXT_TYPE + COMMA_SEP +
                    DatabaseManagerApp.AppEntry.COLUMN_NAME_IMAGE_3 + TEXT_TYPE + " )";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + DatabaseManagerApp.AppEntry.TABLE_NAME;

    DatabaseManager(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_ENTRIES);
        onCreate(db);
    }

}
