package ex190208.Ex01;

public class AbstractExample {
	
	public static void sendSound(MusicPlayer p, String soundStr)
	{
		//MusicPlayer p�� MusicPlayer�� ��ü�� �ǹ�.
		//�θ�Ŭ������ ��ü�� ������� �������� ��ĳ���� �߱⿡
		//�θ�Ŭ���� �ϳ��� ������� § �޼ҵ�ε� ���. ����.
		p.sendSound(soundStr);
	}
	
	public static void main(String[] args)
	{
		
		String str = "test";
		int level = 5;
		
		MusicPlayer speaker = new Speaker(level);
		MusicPlayer earphone = new Earphone(level);
		
		//������ ������ �޼ҵ带 ���� ������ ���ϴ� �ڽ�Ŭ������ sendSound()�� ȣ��.
		sendSound(speaker,str);
		sendSound(earphone,str);
		
		//���� �޼ҵ带 ���� ������ ������ �ڵ带 �������.
//		speaker.sendSound(str);
//		earphone.sendSound(str);
		//�̷�������..
		

		
	}

}
