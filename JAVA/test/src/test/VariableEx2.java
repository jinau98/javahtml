package test;

public class VariableEx2 {
	public static void main(String[] args) {
		double d=10.5;			//8Byte
		int num=10;				//4Byte
		
//		명시적 형변환
		num=(int)d;
		System.out.println(num);
		
//		묵시적 형변환
//		d=num;
//		System.out.println(d);
		
		byte data=1;
		int n = data;
		int k = 10000;
		byte b = (byte)k;
		System.out.println(b);
	}
}
