package ex190110;

public class test01 {

	public static void main(String[] args) {
		
		//��������
		double d1 = 1.3;
		double d2 = 1.8;
		double dr = 0;		//�������庯��
				
		int ir = 0;			//�������庯��
				
		//����� ���
		dr = (int)d1+d2;
		System.out.println(dr);
		ir = (int)(d1+d2);
		System.out.println(ir);
		ir = (int)d1+(int)d2;
		System.out.println(ir);
		
	}	
}
