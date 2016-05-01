class Player{
	private static String game = "Super Mario Bross";
	private int X;
	private int Y;
	
	Player(int x,int y){
		this.X = x;
		this.Y = y;
	}
	
	public void move(){
		X++;
		Y++;
	}
	
	public static void changeGame(String nextGame){
		game = nextGame;
	}

	@Override
	public String toString() {
		return String.format("Game: %s, X: %d, Y: %d ", game, X, Y);
	}
	
	
}
public class StaticDemo {

	public static void main(String[] args) {
		Player p1 = new Player(10, 10);
		Player p2 = new Player(20, 20);
		
		p1.move();
		
		System.out.println("P1 : " + p1);
		System.out.println("P2 : " + p2);
		
		p2.changeGame("Cricket Brian Lara 1997");

		System.out.println("P1 : " + p1);
		System.out.println("P2 : " + p2);
	}

}
