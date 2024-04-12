package downcastiong;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Student student1 = new Student("둘리");
		
		list.add(new Student("둘리"));
		list.add(new Employee("또치"));

		for (Person person : list) {
			person.Eat();
			
			if (person instanceof Student) {
				Student student = (Student) person;
				student.study();
				
			} else if (person instanceof Employee) {
				Employee employee = (Employee) person;
				employee.work();
			}
		}
	}

}
class Person {
	String Name;

	public Person(String name) {
		super();
		Name = name;
	}

	public void Eat() {
		System.out.println(Name + "가 밥을 먹는다.");
	}
}

class Student extends Person {
	
	
	public Student(String name) {
		super(name);
	}

	public void study() {
		System.out.println(Name + " 학생이 공부를 한다.");
	}
}

class Employee extends Person{
	
	public Employee(String name) {
		super(name);
	}

	public void work() {
		System.out.println(Name + " 회사원이 일을 한다.");
	}
}