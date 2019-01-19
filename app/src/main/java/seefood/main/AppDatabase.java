package seefood.main;

import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.Database;

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UserDao myDao();
}

