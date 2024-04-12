package polymorphism;

public class quiz1 {

	public static void main(String[] args) {
		runCar(new Bus());
		runCar(new SportsCar());
	}
	
	public static void runCar(Car car) { // 자식클래스인 버스,스포츠카를 받을 수 있음
		car.run(); // 재정의된 메소드가 호출됨
	}
	
		
//		1. 부모 타입의 매개변수를 사용해서 지식클래스인 버스와 스포츠카를 받기
		
		
		
//		2. 또는 각 클래스 타입의 매개변수로 메소드 만들기
		public static void runCar(Bus bus) {
			bus.run();
		}
		
//		3. 
		public static void runCar(SportsCar sportsCar) {
			sportsCar.run();
		}
	

}
class Car {
	public void run() {
		System.out.println("차가 달린다.");
	}
}

class Bus extends Car {
	
	@Override
	public void run() {
		System.out.println("버스가 달린다.");
	}
}

class SportsCar extends Car {
	
	@Override
	public void run() {
		System.out.println("스포츠카가 달린다.");
	}
}