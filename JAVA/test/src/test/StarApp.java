package test;

public class StarApp {
	
	public static void main(String[] args) {
		Zealot.startAttack();
		//new ���� �޸𸮿� �Ҵ�(allocate)
		Zealot z1= new Zealot();
		
		//���ݷ� ����
		z1.attack = z1.attack+1;
		System.out.println(z1.attack);
		
		//�̸� ����
//		z1.name="���";				//final ����� ���� X
		
		//����
//		z1.startAttack();
	}
	
}
