package ex190207.Test01;

class MP3Player extends Player{
	
	String url;
	
	int play(String name)
	{
		String url = "www";
		this.time = onLinePlay(url);
		System.out.println("�������̵��� play �޼ҵ� ȣ��");
		return this.time;
	}
	
	int download(String url)
	{
		System.out.println("download �޼ҵ� ȣ��");
		return this.time;
	}
	int onLinePlay(String url)
	{
		System.out.println("onLinePlay �޼ҵ� ȣ��");
		return this.time;
	}

}
