package ex190111;

public class ex02 {

	public static void main(String[] args) {
		
		/*
		1.�տ� ����������
		
		2.���������ڰ� ��� ���ŵ� �����
		
		3.�ڿ� ���� ����������		
		*/
		
		int x = 10, y = 10, z;
		System.out.println("--------------------------------");
		x++;
		++x;
		System.out.println("x="+x);
		
		System.out.println("--------------------------------");
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("--------------------------------");
		z=x++;
		//z=x;
		//x++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("--------------------------------");
		z=++x;
		//++x;
		//z=x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("--------------------------------");
		z=++x + y++;
		//++x;
		//z=x+y;
		//y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		x=0;
		y=0;
		z=0;
		int w=0, q=0;
		
		z = ++x + y++ + w++ + q++;	//x->z����->y,w,q������ ����

		System.out.println(x);
		System.out.println(y);
		System.out.println(z); 
		System.out.println("");
		System.out.println(w);
		System.out.println(q);
				
		}
	
}
