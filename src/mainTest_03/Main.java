package mainTest_03;


public class Main {

	public static void main(String[] args) {
		
		//����� �� 4��.
		//���θ�->�����ȣ,��������
		//��������->�����ȣ,���θ�
		//�����ȣ->��,��,���θ�,��������
		//0-�����ȣ,1-�õ�,2-�ñ���,3-���θ�,4-��������
		
		String sourceFolder = "D:\\workspace\\source_file\\";
		String read = "cc_addr.csv";
		FileOpen fileopen = new FileOpen(sourceFolder+read);
		
		fileopen.openSystem();
		LocalAdressSearchSystem lasSystem = new LocalAdressSearchSystem(fileopen.pushList());		
		lasSystem.mainSystem();
		
	}	
}
