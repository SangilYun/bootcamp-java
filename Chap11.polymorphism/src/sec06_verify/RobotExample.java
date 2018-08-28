package sec06_verify;

public class RobotExample {
	
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {
			DanceRobot dr = (DanceRobot)r;
			dr.dance();
		}
		else if(r instanceof SongRobot) {
			SongRobot sr = (SongRobot)r;
			sr.song();
		}
		else if(r instanceof DrawRobot) {
			DrawRobot dr = (DrawRobot)r;
			dr.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = new Robot[] {
				new DanceRobot(),
				new SongRobot(),
				new DrawRobot()
		};
		for(int i =0; i<arr.length;i++) {
			action(arr[i]);
		}
	}
}
