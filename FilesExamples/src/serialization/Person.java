package serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public String name;
	public int age;
	public String email;
	public byte gender;
	
	public void checkMail() {
		System.out.println("Checking " + this.name + "'s mail.");
	}
}
