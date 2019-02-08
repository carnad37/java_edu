package ex190208.Ex01;

public class Earphone extends MusicPlayer{
	//클래스 생성시 오류남:
	//부모클래스가 abstract이기에,
	//자식클래스에서 abstract 메소드를
	//재정의 해주지않게되면 오류가남.
	
	Earphone(int lev)
	{
		//MusicPlayer(부모 클래스)의 생성자를 호출.
		//lev값을 loud에 대입해준다.
		super(lev);
	}
	public int sendSound(String data)
	{
		int result = 0;
		System.out.println("Earphone::sendSound()");
		return result;
	}

}
