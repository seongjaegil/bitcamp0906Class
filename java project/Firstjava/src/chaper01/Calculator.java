package chaper01;

public class Calculator {
	
	/*
	Calculator Ŭ������ ������ ���ô�. 
	�� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ���ϱ� �޼ҵ带 �߰��սô�.
	�� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ���� �޼ҵ带 �߰��սô�.
	�� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ���ϱ� �޼ҵ带 �߰��սô�.
	�� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ������ �޼ҵ带 �߰��սô�.
	*/
	
	//  �� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ���ϱ� �޼ҵ带 �߰��սô�.
	// ������ ��ȯ : ���� �ΰ��� ���ϱ� ������ ����� ��ȯ 
	// �Ű����� : ���� �� ���� �Ű������� ���ڷ� ���޹޾� -> int num1, int num2, 
	// num1+num2 => int
	int add(int num1, int num2) {
		return num1+num2;
		
	} 
	
	
	
    // �� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ���� �޼ҵ带 �߰��սô�.
	// �Ű����� : ���� �� ���� �Ű������� ���ڷ� ���޹޾�
	// num1-num2 => int
	int minus(int num1, int num2) {
		return num1-num2;
	}
	
	
	// �� ���� �� ���� �Ű������� ���ڷ� ���޹޾� ���ϱ� �޼ҵ带 �߰��սô�.
	// �Ű����� : ���� �� ���� �Ű������� ���ڷ� ���޹޾� => long num1, long num2
	// int * int => int, (long)int * int => 22��,
	// long * int = long
	long multiply(long num1, long num2) {
		return num1*num2; // ����� int
		// long * int -> long * long -> long
	}
	
	// ���� �� ���� �Ű������� ���ڷ� ���޹޾� ������ �޼ҵ带 �߰��սô�.
	// int / int => int
	// devide(1,2)
	// devide(1.5, 2.0)
	// �޼ҵ��� �����ε��� �޼ҵ��� ȣ��ÿ� ��������.
	int devide(int num1, int num2) {
		return num1/num2;
	}
	
	// �����ε� : �޼ҵ��� �̸��� ���� �޼ҵ带 ���� 
	// �����ε��� ���� : �̸��� ����, �Ű������� ���� �Ǵ� �Ű������� Ÿ���� �޶���Ѵ�, ��ȯŸ���� �ǹ̰� ����!
	float devide(float num1, float num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		
		// Ŭ������ ���ǵ� �޼ҵ��� ��� => Ŭ������ �̿��ؼ� �ν��Ͻ�(��ü)�� ����
		// Ŭ������ ���(����, �޼ҵ�)���� �޸𸮿� �ε�ȴ�.
		// ��ü ���� : new Ŭ���� �̸�() => ������(��ü�� �޸� �ּҰ�)
		// �������� : ��ü�� �ּҰ��� �����ϴ� �����ϴ� ����
		// Ŭ�����̸� �����̸�
		Calculator cal = new Calculator();
		
		System.out.println("���ϱ� �޼ҵ� ȣ��");
		System.out.println("1+2="+cal.add(1,2));
		System.out.println("���� �޼ҵ� ȣ��");
		System.out.println("20-10="+cal.minus(20, 10));
		System.out.println("1000000*1000000="+cal.multiply(1000000, 1000000));
		// �ڵ� ����ȯ : byte->short->int->long
		System.out.println("���� ������ �޼ҵ� ȣ��");
		System.out.println("10/3="+cal.devide(10,  3));
		System.out.println("�Ǽ� ������ �޼ҵ� ȣ��");
		System.out.println("10.0/3.0="+cal.devide(10.0f, 3.0f));
		// ������ �⺻ Ÿ���� => int
		// �Ǽ��� �⺻ Ÿ���� => double
		// 10.0/3.0 => double/double
		
	}


}
