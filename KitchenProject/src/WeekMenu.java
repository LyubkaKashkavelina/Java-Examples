import java.util.Arrays;

public class WeekMenu {
	private DailyMenu[] menu;
	
	public WeekMenu() {
		this((byte)5);
	}
	
	public WeekMenu(byte count) {
		if (count>0 && count<8) {
			menu = new DailyMenu[count];
			for(int i=0;i<menu.length;i++) {
				menu[i] = new DailyMenu();
			}
		}
	}
	
	public WeekMenu(DailyMenu[] menu) {
		this.menu = new DailyMenu[countUniqueMenu(menu)];	
		this.menu[0] = new DailyMenu(menu[0]);
		for(int i=1,j=1;i<menu.length;i++) {
			if (isNotExist(menu[i],i))
				this.menu[j++] = new DailyMenu(menu[i]);
		}
	}
	
	private boolean isNotExist(DailyMenu menu1, DailyMenu[] menu, 
			int cnt) {
		for (int i=0;i<cnt;i++) {
			if (menu1.equals(menu[i]))
				return false;
		}
		return true;
	}
	private boolean isNotExist(DailyMenu menu, int cnt) {
		for (int i=0;i<cnt;i++) {
			if (menu.equals(this.menu[i]))
				return false;
		}
		return true;
	}
	private short countUniqueMenu(DailyMenu[] menu) {
		short len=1;
		for (int i=1;i<menu.length;i++)
			if(isNotExist(menu[i],menu,i)) {
				len++;
			}
		return len;
	}
	
	public DailyMenu[] getMenu() {
		return menu;
	}
	
	public void setMenu(DailyMenu[] menu) {
		this.menu = menu;
	}

	@Override
	public String toString() {
		return "WeekMenu [menu=" + Arrays.toString(menu) + "]";
	}
	
}
