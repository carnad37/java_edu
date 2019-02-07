package ex190207.Ex03;

class UpcastingEx {

	public static void main(String[] args) {
		
		Person p;
		//부모클래스의 객체 생성
		Student s = new Student("이재문");
		//자식 클래스의 객체가 선언되며 생성자 호출. 생성자에 포함된 super(name)도 호출됨.
		p = s;
		//업캐스팅이 발생.
		
//		s.name = "바꿔봄";
		//p는 s의 부모클래스의 필드값을 공유함. s의 값을 바꿔주면 자연히 p의 값도 바뀌게 된다.
		System.out.println(p.name);
		
//		p.garde = "A";
		//grade는 자식 클래스가 가지고있는 필드값이다.
//		p.department = "com";
		//위와 같은 이유.
	}
	
}
