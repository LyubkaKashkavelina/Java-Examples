package com.company;

public class WeekMenu {
    private DailyMenu[] menu;

    public WeekMenu() {
        this ((byte)7);
    }
    public WeekMenu(byte count)
    {
        if(count>0&&count<8) {
            menu = new DailyMenu[count];
        }
    }

    public DailyMenu[] getMenu() {
        return menu;
    }

    public void setMenu(DailyMenu[] menu) {
        this.menu = menu;
    }
}
