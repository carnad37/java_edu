package mainTest_03;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		//����� �� 4��.
		//���θ�->�����ȣ,��������
		//��������->�����ȣ,���θ�
		//�����ȣ->��,��,���θ�,��������
		//0-�����ȣ,1-�õ�,2-�ñ���,3-���θ�,4-��������
		
		String sourceFolder = "D:\\hhs\\javaSourceData\\";
		String read = "cc_addr.csv";
		FileOpen fileopen = new FileOpen();
		
		List<String> listData = fileopen.openSystem(sourceFolder+read);
				
		LocalAdressSearchSystem lasSystem = new LocalAdressSearchSystem();
		lasSystem.mainSystem(listData);
		
	}	
}
