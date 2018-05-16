
public class Dish {
	private String name;
	private short measure;
	
	public String getName() {
		return name;
	}
	
	public void setName(String value) {
		name = value;
	}
	
	public short getMeasure() {
		return measure;
	}
	
	public void setMeasure(short measure) {
		if (measure>=100 && measure<=200) {
			this.measure = measure;
		}
	}
	
	public Dish() {
		this(null,(short)0);
	}
	public Dish(Dish dish) {
		this(dish.name,dish.measure);
	}
	public Dish(String name, short measure) {
		this.name = name;
		setMeasure(measure);
	}
	
	@Override
	public int hashCode() {
/*		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
*/
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
/*		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dish other = (Dish) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
*/
		if (obj != null && obj instanceof Dish) {
			Dish other = (Dish)obj;
			return name.equals(other.name);
			
		}
		return false;
	}

	@Override
	public String toString() {
		return "Dish [name=" + name + ", measure=" + measure + "]";
	}
	
	
}
