package chaper02;

public class Member {
	/*
	�� String Ÿ���� �̸��� ������ �� �ִ� ���� name�� �����غ��ô�.
	�� int Ÿ���� ���̸� ������ �� �ִ� ���� age�� �����غ��ô�.
	�� double Ÿ���� Ű�� ������ �� �ִ� ���� height�� �����غ��ô�.
	�� boolean Ÿ���� JAVAå�� ���� ���θ� ������ �� �ִ� ���� hasBook�� �����غ��ô�.
	�� �̸��� ����, Ű, å�� ���� ���θ� ����غ��ô�
	*/
	
	// Ŭ���� ���� 
	// [����������] [final] Ŭ���� �̸� {}
	// {
	//   ���� ����
	//   �޼ҵ� ����
	// }
	// �ν��Ͻ� ������ �ڵ� �ʱ�ȭ
	
    String name;    // ������� �̸��� �����ϴ� ����
	int age;        // ������� ���̸� �����ϴ� ����
	double height;   // ������� Ű�� �����ϴ� ����
	boolean hasBook;  // �ڹ� å ��������
	// private : ĸ��ȭ ? �����������ַ��� 
	
	// ȸ���� �����͸� ����ϴ� �޼ҵ�
	void printData() {
		System.out.println("�̸�:" + name);
        System.out.println("����:" + age);
        System.out.println("Ű:" + height);
        System.out.println("�ڹ� ������ ���� ����:" + hasBook);
		
	}
	
    public static void main(String[] args) {
    	
    	long juminNumber = 9701011111111L;
    	
    	// Member Ŭ������ �ν��Ͻ��� ���� -> �̸�, ����, Ű, å�������� �����Ҽ� �ִ� �޸𸮰����� ����
    	Member member = new Member(); 
    	
    	// �ν��Ͻ��� ������ �����ؼ� ��� 
    	//System.out.println("�̸�:" + member.name);
        //System.out.println("����:" + member.age);
        //System.out.println("Ű:" + member.height);
       // System.out.println("�ڹ� ������ ���� ����:" + member.hasBook);
    	
    	member.printData();
    	
    	// �ν��Ͻ� ������ ���� ����
    	member.name = "�漺��";
    	member.age = 27;
    	member.height = 185.8;
    	member.hasBook = true;
    	
    	System.out.println("------------------------------------------");
    	System.out.println("���Ͻ� ������ ���� ����");
    	System.out.println("------------------------------------------");
    	
    	//System.out.println("�̸�:" + member.name);
        //System.out.println("����:" + member.age);
        //System.out.println("Ű:" + member.height);
        //System.out.println("�ڹ� ������ ���� ����:" + member.hasBook);
    	
    	member.printData();
    	
        // ���� �ڵ�� => �޼ҵ�� ���� => Member Ŭ�������� �޼ҵ带 ����
        
    	
    	
    	
    	
    
		
	}
}
