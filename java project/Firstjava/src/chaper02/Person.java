package chaper02;

public class Person {

//  2. Person Ŭ������ ����� ����, �Ʒ��� ȸ�� ������ �����ϴ� �������� �����غ��ô�. 
//	      �����̸��� �ۼ��ϴ� ��Ģ�� �°� ���� ���� �̸��� ������ ������. 
//	��  ȸ���̸��� �����ϴ� ����
//	��  ȸ�� ��ȭ��ȣ ( 000-0000-0000 )�� �����ϴ� ����
//	��  ȸ�� �ֹε�Ϲ�ȣ ( 000000-0000000 �Ǵ� 0000000000000 )�� �����ϴ� ����
	
	// private : Ŭ���� ���ο��� ����鸸 ������ �����ϵ��� �ϴ� ���� ������
	
	private String MemberName;   // ȸ���� �̸�
	private String phoneNumber;  // ��ȭ��ȣ
	// String juminNumber;  // �ֹε�Ϲ�ȣ
	private long juminNumber;
	
	
	// setter / getter
	// setter => ���� �޾Ƽ� ������ ����
	public void setMemberName(String name) {
		MemberName=name;
		
	}
    // getter => �ν��Ͻ� ������ ��ȯ
	public String getMemberName() {
		return MemberName;
	}
	
	public void setPhoneNumber(String number) {
		phoneNumber=number;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
    // setter
	public void setJuminNumber(long number) {
		juminNumber=number;
		
	}
	
	// getter
	public long getJuminNumber() {
		return juminNumber;
		
	}
	
	// ��ü ������ ���
	public void printData() {
		System.out.println("�̸�:" + MemberName);
		System.out.println("��ȭ��ȣ:"+ phoneNumber);
		System.out.println("�ֹι�ȣ:"+ juminNumber);
		
		
	}
}
