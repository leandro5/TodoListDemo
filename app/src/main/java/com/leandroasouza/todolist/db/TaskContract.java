package com.leandroasouza.todolist.db;

import android.provider.BaseColumns;

/**
 * Created by Leandro on 6/15/2016.
 */
public class TaskContract {
    public static final String DB_NAME = "com.leandroasouza.todolist.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";
    }
}
