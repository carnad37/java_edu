package ex190207.Test01;

class Player {
	
	String name;
	int time = 0;
	
	int play(String name)
	{
		System.out.println("play 메소드가 호출");
		return this.time;
	}
	int stop()
	{
		System.out.println("stop 메소드가 호출");
		return this.time;
	}
	void fastforward(int time)
	{
		System.out.println("fastforward 메소드가 호출");
	}
	void rewind(int time)
	{
		System.out.println("rewind 메소드가 호출");
	}

}
