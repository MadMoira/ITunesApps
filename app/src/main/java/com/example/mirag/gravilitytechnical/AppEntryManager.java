package com.example.mirag.gravilitytechnical;

import android.provider.BaseColumns;

class AppEntryManager {

    static String queryAppByID = "SELECT * FROM apps WHERE app_id = %s";
    static String queryAppsByCategory = "SELECT * FROM apps WHERE category = '%s'";
    static String queryGeneralSingleValue = "SELECT * FROM apps WHERE %s = %s";
    static String queryAllCategories = "SELECT %s FROM apps";

    private AppEntryManager() {}

    static class AppEntry implements BaseColumns {
        static final String TABLE_NAME = "apps";
        static final String COLUMN_NAME_APP_ID = "app_id";
        static final String COLUMN_NAME_NAME = "name";
        static final String COLUMN_NAME_IMAGE_1 = "image_1";
        static final String COLUMN_NAME_IMAGE_2 = "image_2";
        static final String COLUMN_NAME_IMAGE_3 = "image_3";
        static final String COLUMN_NAME_SUMMARY = "summary";
        static final String COLUMN_NAME_PRICE_VALUE = "price_value";
        static final String COLUMN_NAME_PRICE_CURRENCY = "price_currency";
        static final String COLUMN_NAME_TITLE = "title";
        static final String COLUMN_NAME_RELEASE_DATE = "release_date";
        static final String COLUMN_NAME_CATEGORY = "category";
    }

}
