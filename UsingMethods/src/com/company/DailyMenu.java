package com.company;

public class DailyMenu {
    private Dish breakfast;
    private Dish lunch;
    private  Dish dinner;

    public Dish getBreakfast() {
        return breakfast;
    }

    public void setBreakfast(Dish breakfast) {
        this.breakfast = breakfast;
    }

    public Dish getLunch() {
        return lunch;
    }

    public void setLunch(Dish lunch) {
        this.lunch = lunch;
    }

    public Dish getDinner() {
        return dinner;
    }

    public void setDinner(Dish dinner) {
        this.dinner = dinner;
    }

    @Override
    public String toString() {
        return "[" + breakfast + "," + lunch + "," + dinner + "]";
    }

    public DailyMenu(Dish breakfast, Dish lunch, Dish dinner) {
        this.breakfast = breakfast;
        this.lunch = lunch;
        this.dinner = dinner;
    }


}
