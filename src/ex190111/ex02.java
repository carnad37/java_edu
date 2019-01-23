package ex190111;

public class ex02 {

	public static void main(String[] args) {
		
		/*
		1.앞에 증감연산자
		
		2.증감연산자가 모두 제거된 연산식
		
		3.뒤에 붙은 증감연산자		
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
		
		z = ++x + y++ + w++ + q++;	//x->z연산->y,w,q순으로 연산

		System.out.println(x);
		System.out.println(y);
		System.out.println(z); 
		System.out.println("");
		System.out.println(w);
		System.out.println(q);
				
		}
	
}
