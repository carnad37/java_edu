package ex190208.Ex01;

public class Speaker extends MusicPlayer{
	//Ŭ���� ������ ������:
	//�θ�Ŭ������ abstract�̱⿡,
	//�ڽ�Ŭ�������� abstract �޼ҵ带
	//������ �������ʰԵǸ� ��������.

	Speaker(int lev)
	{
		super(lev);
	}
	public int sendSound(String data)
	{
		int result = 0;
		System.out.println("Speaker::sendSound()");
		return result;
	}
	
}
