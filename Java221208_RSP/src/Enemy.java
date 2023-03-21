import java.util.Random;

// 강사님이 하신거
public class Enemy {
	Random r;
	public Enemy() {
		r = new Random();
	}
	
	public int think() {
		return r.nextInt(3) + 1;
	}
}
