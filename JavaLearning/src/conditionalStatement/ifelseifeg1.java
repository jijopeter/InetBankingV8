package conditionalStatement;

public class ifelseifeg1 {

	public static void main(String[] args) 
	{
		String software="playit player";
		if(software.equalsIgnoreCase("vlc player"))
		{
			System.out.println("play the song in vlc player");
		}
		else if(software.equalsIgnoreCase("mpx player"))
		{
			System.out.println("play the song in mpx player");
		}
		else if(software.equalsIgnoreCase("playit player"))
		{
			System.out.println("Play the song in playit");
		}
		else
		{
			System.out.println("dont play the song");
		}
	}

}
