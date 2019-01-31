package ex190131.Test01;

public class Main {
	
	public static void main(String[] args) {
		
		int i = 0, j = 0;
		int objCounter = 0, counter = 0;
		//Circle에 5개의 빈 배열 생성.
		Circle[] cirArr = new Circle[5];
		
		for(i=0;i<cirArr.length;i++)
		{
			//만들어진 각각의 배열에 객체를 생성.
			cirArr[i] = new Circle();
			for(j=0;j<10;j++)
			{
				//각각의 객체의 count에 1씩 더해준다.
				cirArr[i].count++;
			}
			//생성자에 추가해줘도 되나, 메인메소드에서 불러오는게 더 빠르다.
			Circle.objCount++;
		}
		
		for(i=0;i<cirArr.length;i++)
		{
			//couter 변수에 객체가 가진 counter값을 리턴받는다.
			counter = cirArr[i].getCount();
			//출력.
			System.out.println(counter);
		}
		objCounter = Circle.getObjCount();
		System.out.println(objCounter);
		
	}
}
		
		
		
		
		