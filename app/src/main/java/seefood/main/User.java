package seefood.main;

import android.arch.persistence.room.*;

@Entity(tableName = "users")
public class User {

    @PrimaryKey
    private String name;
    private String calories;
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}


// https://www.youtube.com/watch?v=Ta4pw2nUUE4
