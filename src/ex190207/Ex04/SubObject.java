package ex190207.Ex04;

class SubObject extends SuperObject {

	public static void main(String[] args) {
		
		SuperObject b = new SubObject();
		//업캐스팅(서브에서 생성된 객체를 슈퍼 객체에 대입)
		b.paint();
		
	}
	
}
