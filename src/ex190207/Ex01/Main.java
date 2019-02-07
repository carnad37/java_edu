package ex190207.Ex01;

class Main {

	public static void main(String[] args) 
	{
		Player p = new Player();
		MP3Player mp = new MP3Player();
		
		int res = 0;
		String name = null;
		String url = null;
		
		res = p.play(name);
		res = mp.play(name);
		
		res = mp.download(url);
	}	
}
