package ex190207.Ex03;

public class DowncastingEx {
	
	public static void main(String[] args) {
		
		Person p = new Student("���繮");
		//��ĳ����
		Student s;
		//�ڽ� Ŭ������ ��ä ����.
		
		s = (Student)p;
		//�ٿ�ĳ����
		//�θ� Ŭ���� ��ü�� �ڽ�Ŭ���� ��ü�� ����.
		//(�ڽ�Ŭ����)�θ�Ŭ������ ��ü �� �������� ������ cannot convert�� ���Եȴ�.
		
		System.out.println(s.name);
		
		s.grade = "A";
		//��������.
	}

}
