package Collections.ComparatorExample;

public class Person implements Comparable {
	private String firstName;
	private String lastName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
//
//	compare method has the following signature.
//	public int compare(java.lang.Object o1, java.lang.Object o2)
//	compare returns zero if o1 and o2 are equal, a negative integer if o1 is less than o2,
//	and a positive integer if o1 is greater than o2

	public int compareTo(Object anotherPerson)
			throws ClassCastException {
		if (!(anotherPerson instanceof Person)) {
			throw new ClassCastException(
					"A Person object expected.");
		}
		int anotherPersonAge = ((Person) anotherPerson).getAge();
		return this.age - anotherPersonAge;
	}
}
