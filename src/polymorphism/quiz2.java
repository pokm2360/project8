package polymorphism;

import java.util.ArrayList;

public class quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		Customer customer1 = new Customer("둘리");
		Customer customer2 = new GOLDCustomer("또치");
		Customer customer3 = new VIPCustomer("도우너");
		
		customerList.add(customer1); //리스트에 회원 추가
		customerList.add(customer2);
		customerList.add(customer3);
		
		
		for (Customer customer : customerList) {
			customer.calcPrice(10000);
			customer.showInfo(); // 고객정보 출력
		}

	}
}

class GOLDCustomer extends Customer {

	double saleRatio;

	public GOLDCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	//generate를 사용해서 메소드 재정의하기
	
	@Override
	public void calcPrice(int price) {
		bonusPoint = bonusPoint + (price * bonusRatio);
		int salePrice = price - (int) (price * saleRatio); //할인률을 적용해서 할인가 구하기
		System.out.println(customerName+"님이 " + salePrice + "원을 결제했습니다."); //할인된 가격을 지불
	}
}
