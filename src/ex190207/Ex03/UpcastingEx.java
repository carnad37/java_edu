package ex190207.Ex03;

class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		//�θ�Ŭ������ ��ü ����
		Student s = new Student("���繮");
		//�ڽ� Ŭ������ ��ü�� ����Ǹ� ������ ȣ��. �����ڿ� ���Ե� super(name)�� ȣ���.
		p = s;
		//��ĳ������ �߻�.
		
//		s.name = "�ٲ㺽";
		//p�� s�� �θ�Ŭ������ �ʵ尪�� ������. s�� ���� �ٲ��ָ� �ڿ��� p�� ���� �ٲ�� �ȴ�.
		System.out.println(p.name);
		
//		p.garde = "A";
		//grade�� �ڽ� Ŭ������ �������ִ� �ʵ尪�̴�.
//		p.department = "com";
		//���� ���� ����.
	}
	
}
