
public class DailyMenu {
	private Dish breakfast;
	private Dish lunch;
	private Dish dinner;
	//private Dish[] menu;
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
		
	public DailyMenu() {
		this(new Dish(),new Dish(),new Dish());
	}
	public DailyMenu(DailyMenu menu) {
		this(new Dish(menu.breakfast), new Dish(menu.lunch),
				new Dish(menu.dinner));
	}
	public DailyMenu(Dish breakfast, Dish lunch, Dish dinner) {
//		super();
		this.breakfast = breakfast;
		this.lunch = lunch;
		this.dinner = dinner;
	}
	public int hashCode() {
		return super.hashCode();
	}
	public boolean equals(Object obj) {
		if (obj!=null && obj instanceof DailyMenu) {
			DailyMenu menu = (DailyMenu)obj;
			int repeat=0;
			if(breakfast.equals(menu.breakfast))
				repeat++;
			if(lunch.equals(menu.lunch))
				repeat++;
			if(dinner.equals(menu.dinner))
				repeat++;
			return repeat>=2;
		}
		return false;
	}
	public String toString() {
		return "["+breakfast+", "+lunch+", "+dinner+"]";
	}
}
