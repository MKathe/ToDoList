package com.example.kath.todolist.data.repositories.local;

import android.provider.BaseColumns;

/**
 * Created by Desarrollo3 on 2/02/2017.
 */

public class TaskContract {
    public static final String DB_NAME = "com.kath.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}
