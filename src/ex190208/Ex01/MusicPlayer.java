package ex190208.Ex01;

public abstract class MusicPlayer {

	public String company;
	public int loud;
	
	MusicPlayer(int lev)
	//持失切 持失
	{
		this.loud = lev;
	}
	public void Play(int num)
	{
		System.out.println("MusicPlayer::Play()");
	}
	public abstract int sendSound(String data);
	//蓄雌五社球 識情.
}
