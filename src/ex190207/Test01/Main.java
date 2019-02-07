package ex190207.Test01;

class Main {

	public static void main(String[] args) 
	{
//		Player p = new Player();
//		MP3Player mp = new MP3Player();
//		
//		int res = 0;
//		String name = null;
//		String url = null;
//		
//		res = p.play(name);
//		res = mp.play(name);
//		
//		res = mp.download(url);
//		Player p = new MP3Player();
		Player p;
		MP3Player mp = new MP3Player();
		p = mp;
		Player oldp = new Player();
		int res = 0;
		String name = null;
		res = p.play(name);
		res = oldp.play(name);
			
	}
}
