package chaper02;

public class PersonMain {

	public static void main(String[] args) {
		
		// person Ŭ������ �ν��Ͻ� ����
		Person p = new Person();
		
		// p.memberName = "�漺��";
		p.setMemberName("�����");
		p.setPhoneNumber("010-7777-7777");
		p.setJuminNumber(9912121111111L);
		
		System.out.println("�̸�:" + p.getMemberName());
		System.out.println("��ȭ��ȣ:"+ p.getPhoneNumber());
		System.out.println("�ֹι�ȣ:"+ p.getJuminNumber());
		
		System.out.println("----------------------------");
		p.printData();

	}

}
