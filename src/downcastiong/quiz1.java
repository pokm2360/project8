package downcastiong;

import java.util.ArrayList;

public class quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		
//		Human human = new Human();
//		Tiger tiger = new Tiger();
//		Eagle eagle = new Eagle();
//		
//		list.add(human);
//		list.add(eagle);
//		list.add(tiger);

		list.add(new Human());
		list.add(new Tiger());
		list.add(new Eagle());
		
		for (int i=0; i<list.size(); i++) { //요소를 꺼내서 Animal형 변수에 카피
			Animal ani = list.get(i);
			
			if (ani instanceof Human) { //인스턴스의 타입이 Human형이면
				Human h = (Human) ani; // Human형으로 다운캐스팅
				h.readBook();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			}
		}
	}

}
