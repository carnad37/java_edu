package ex190208.Ex01;

public class Earphone extends MusicPlayer{
	//Ŭ���� ������ ������:
	//�θ�Ŭ������ abstract�̱⿡,
	//�ڽ�Ŭ�������� abstract �޼ҵ带
	//������ �������ʰԵǸ� ��������.
	
	Earphone(int lev)
	{
		//MusicPlayer(�θ� Ŭ����)�� �����ڸ� ȣ��.
		//lev���� loud�� �������ش�.
		super(lev);
	}
	public int sendSound(String data)
	{
		int result = 0;
		System.out.println("Earphone::sendSound()");
		return result;
	}

}
