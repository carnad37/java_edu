package ex190207.Ex01;

class MP3Player extends Player{
	
	String url;
	
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
