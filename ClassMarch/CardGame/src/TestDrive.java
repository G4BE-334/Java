
public class TestDrive {

	public static void main(String[] args) {
		Game game = new Game();
		game.Play();
	}
	
	public static void XYZ (int value) {
		switch(value) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 0:
			break;
		}
	}
	public static void XYZ2 (CollegeYear value) {
		switch(value) {
		
		// 1) Self documenting
		// 2) All possible states of "value" are knowable
		case FRESHMAN:
			break;
		case SOPHMORE:
			break;
		case JUNIOR:
			break;
		case SENIOR:
			break;
		}
	}
}
