package co.simplon.algorythmes;

public class PingPong {
	public static void main(String[] args) {
		
		String input = args[0];
		String[] pingsPongs = input.split(",");
		int pings = 0;
		int pongs = 0;
		for (int i = 0; i < pingsPongs.length; i++) {
			if(pingsPongs[i].equals("ping")) {
				pings++;
			} else {
				pongs++;
			}
		}
		System.out.println( "Match result ping vs pong: " + pings + "-" + pongs);
	}

}
