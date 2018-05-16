
public class KitchenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dish dish1 = new Dish("krem",(short)100);
		Dish dish2 = new Dish("krem",(short)120);
		Dish dish3 = new Dish("supa",(short)200);
		System.out.println("krem==krem\t"+dish1.equals(dish2));
		System.out.println("krem==supa\t"+dish1.equals(dish3));
		System.out.println("supa==krem\t"+dish3.equals(dish2));
		DailyMenu dish = new DailyMenu(new Dish("krem",(short)130),
				new Dish("supa",(short)200), 
				new Dish("musaka",(short)120));
		DailyMenu dish11 = new DailyMenu(new Dish("krem",(short)130),
				new Dish("supa1",(short)200), 
				new Dish("musaka1",(short)120));
		DailyMenu dish22 = new DailyMenu(new Dish("krem",(short)130),
				new Dish("supa",(short)200), 
				new Dish("musaka2",(short)120));
		System.out.println("ednakva zakuska: "+dish.equals(dish11));
		System.out.println("ednakvi zakuska i objad: "+dish.equals(dish22));
		System.out.println(dish);
		WeekMenu menu = new WeekMenu();
		WeekMenu menu1 = new WeekMenu(new DailyMenu[] {
				new DailyMenu(new Dish("krem1",(short)130),
						new Dish("supa1",(short)200), 
						new Dish("musaka1",(short)120)),
				new DailyMenu(new Dish("krem2",(short)130),
						new Dish("supa2",(short)200), 
						new Dish("makaroni",(short)120)),
				new DailyMenu(new Dish("krem2",(short)130),
						new Dish("supa2",(short)200), 
						new Dish("makaroni",(short)120))});
		System.out.println(menu);
		System.out.println(menu1);
	}

}
