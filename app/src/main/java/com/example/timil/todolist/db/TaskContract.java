package com.example.timil.todolist.db;

import android.provider.BaseColumns;

/**
 * Created by TimiL on 20/01/2018.
 */

public class TaskContract {
    public static final String DB_NAME = "com.example.timil.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }


}
