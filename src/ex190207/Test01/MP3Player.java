package ex190207.Test01;

class MP3Player extends Player{
	
	String url;
	
	int play(String name)
	{
		String url = "www";
		this.time = onLinePlay(url);
		System.out.println("오버라이딩된 play 메소드 호출");
		return this.time;
	}
	
	int download(String url)
	{
		System.out.println("download 메소드 호출");
		return this.time;
	}
	int onLinePlay(String url)
	{
		System.out.println("onLinePlay 메소드 호출");
		return this.time;
	}

}
