package test; //ctrl + shift + F  정렬

public class Coin2 {
	public static void main(String[] args) {

		final int money = 2680; // 상수
		int rest_money = money; // 변수의 초기화
		int count; // 변수의 선언

		int arr[] = { 500, 100, 50, 10 };
		
		for (int i=0; i<arr.length; i++){
			count = rest_money / arr[i];
			System.out.println(arr[i]+ "원 : " + count);
			rest_money = rest_money%arr[i];
			System.out.println("남은 금액 : " + rest_money);
		}
//		count = money / 500;
//		System.out.println("500원 : " + count);
//		rest_money = money - (count * 500);
//		System.out.println("남은 금액 : " + rest_money);
//		count = rest_money / 100;
//		System.out.println("100원 : " + count);
//		rest_money = rest_money - (count * 100);
//		System.out.println("남은 금액 : " + rest_money);
//		count = rest_money / 50;
//		System.out.println("50원 : " + count);
//		rest_money = rest_money - (count * 50);
//		System.out.println("남은 금액 :  " + rest_money);
//		count = rest_money / 10;
//		System.out.println("10원 : " + count);
//		rest_money = rest_money - (count * 10);
//		System.out.println("남은 금액 :  " + rest_money);
	}
}
