package ex190207.Ex03;

public class DowncastingEx {
	
	public static void main(String[] args) {
		
		Person p = new Student("이재문");
		//업캐스팅
		Student s;
		//자식 클래스의 객채 생성.
		
		s = (Student)p;
		//다운캐스팅
		//부모 클래스 객체를 자식클래스 객체와 공유.
		//(자식클래스)부모클래스의 객체 로 적어주지 않으면 cannot convert를 보게된다.
		
		System.out.println(s.name);
		
		s.grade = "A";
		//오류없다.
	}

}
