package downcastiong;

public class Ex1 {

	public static void main(String[] args) {
		
//		부모 타입으로 형변환
		Animal animal = new Human(); // 물려받은것만 쓸 수 있음. readBook은 사용 못함, 쓸 수 있게 하려고 다운캐스팅!!
		
//		타입을 확인해야하는 이유: 컴파일 오류는 안나고 런타임오류가 남
		Tiger tiger = (Tiger) animal;
		
		Eagle eagle = (Eagle) animal;
		
		if (animal instanceof Human) {
//			다운캐스팅은 클래스 타입 명시!!
			Human human = (Human) animal;
			
			human.readBook();
		}

	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal { // Animal 클래스 상속받기
	public void move() { // 메소드 재정의
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal { // Animal 클래스 상속받기
	public void move() { // 메소드 재정의
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal { // Animal 클래스 상속받기
	public void move() { // 메소드 재정의
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 납니다.");
	}
}