package ex190207.Test01;

class Player {
	
	String name;
	int time = 0;
	
	int play(String name)
	{
		System.out.println("play �޼ҵ尡 ȣ��");
		return this.time;
	}
	int stop()
	{
		System.out.println("stop �޼ҵ尡 ȣ��");
		return this.time;
	}
	void fastforward(int time)
	{
		System.out.println("fastforward �޼ҵ尡 ȣ��");
	}
	void rewind(int time)
	{
		System.out.println("rewind �޼ҵ尡 ȣ��");
	}

}
