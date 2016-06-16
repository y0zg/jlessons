package Polymorphism;

class Employee{
	public void work(){
		System.out.println("Employee work");
	}
}

class Manager extends Employee {

	public void work(){
		System.out.println("Manager work");
	}

	public void manage(){
		System.out.println("managing...");
	}
}

public class PolymorphismDemo1 {
	public static void main(String[] args) {
		Employee emp=new Manager();
		emp.work();//Manager work
		System.out.println(emp.getClass().getName());//Polymorphism.Manager
// without (Manager)
// java: incompatible types: Polymorphism.Employee cannot be converted to Polymorphism .Manager
		Manager man= (Manager) emp;
		man.manage(); //managing...
	}
}
