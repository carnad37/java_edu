package ex190208.Ex01;

public class AbstractExample {
	
	public static void sendSound(MusicPlayer p, String soundStr)
	{
		//MusicPlayer p는 MusicPlayer의 객체를 의미.
		//부모클래스의 객체를 대상으로 했음에도 업캐스팅 했기에
		//부모클래스 하나를 대상으로 짠 메소드로도 충분. 편리함.
		p.sendSound(soundStr);
	}
	
	public static void main(String[] args)
	{
		
		String str = "test";
		int level = 5;
		
		MusicPlayer speaker = new Speaker(level);
		MusicPlayer earphone = new Earphone(level);
		
		//위에서 생성된 메소드를 통해 각각의 원하는 자식클래스의 sendSound()를 호출.
		sendSound(speaker,str);
		sendSound(earphone,str);
		
		//위에 메소드를 넣지 않으면 일일이 코드를 써줘야함.
//		speaker.sendSound(str);
//		earphone.sendSound(str);
		//이런식으로..
		

		
	}

}
