package ex190110;

public class ex01 {

	public static void main(String[] args) {
		int num = 18;
		int nz2=0;
		int nz16=0;
		String z2=null;
		String z16=null;

		z2 = Integer.toBinaryString(num);
		z16 = Integer.toHexString(num);
		//��ȯ�Ǿ� ����� ���� String�̴�. ��ȯ�� �̿�Ǵ°��� int���̴�. �� int->String
		System.out.println(num+"�� 2������ ��ȯ�� ���� "+z2+"�̰�\n16������ ��ȯ�� ���� "+z16+"�̴�."+"\n");
		nz2 = Integer.parseInt(z2);
		nz16 = Integer.parseInt(z16);
		System.out.println("���ڿ��� ������ ���·� �����ϸ� ����� �����ϴ�.\n��ȯ�� "+num+"�� 2������ 16������ ���� "+(nz2+nz16));
				
	}
	
}
