package ex190131.Test01;

public class Main {
	
	public static void main(String[] args) {
		
		int i = 0, j = 0;
		int objCounter = 0, counter = 0;
		//Circle�� 5���� �� �迭 ����.
		Circle[] cirArr = new Circle[5];
		
		for(i=0;i<cirArr.length;i++)
		{
			//������� ������ �迭�� ��ü�� ����.
			cirArr[i] = new Circle();
			for(j=0;j<10;j++)
			{
				//������ ��ü�� count�� 1�� �����ش�.
				cirArr[i].count++;
			}
			//�����ڿ� �߰����൵ �ǳ�, ���θ޼ҵ忡�� �ҷ����°� �� ������.
			Circle.objCount++;
		}
		
		for(i=0;i<cirArr.length;i++)
		{
			//couter ������ ��ü�� ���� counter���� ���Ϲ޴´�.
			counter = cirArr[i].getCount();
			//���.
			System.out.println(counter);
		}
		objCounter = Circle.getObjCount();
		System.out.println(objCounter);
		
	}
}
		
		
		
		
		