package test;

public class ArrayEx1 {
	public static void main(String[] args) {
		int arr[] = { 7, 5 };

		int temp = 0;

		temp = arr[0];
		arr[0] = arr[1];
		arr[1] = temp;

		// 배열의 생성원리
		// 1. 크기
		// 2. 개수
		// 3. 시작주소

		// 배열의 특징
		// 1. 사이즈를 늘릴 수 없다.
		// 2. 사이즈를 줄일 수 없다.
		// 3. 값의 변경은 가능하다.
		// 4.연속된 주소번지에 저장된다.(풀스캔)
	}
}
