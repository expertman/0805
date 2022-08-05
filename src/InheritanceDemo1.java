
public class InheritanceDemo1 {
	public static void main(String[] args) {
		Manager m = new Manager();
		Employee e = new Employee();
		//System.out.println(m.salary);
		//System.out.println(e.name);
		System.out.println(e.salary);  //상속
	}
}
class Manager extends System{
	int salary = 100000;
}
class Employee extends Manager{
	String name = "한지민";
}