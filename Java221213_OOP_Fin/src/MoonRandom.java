
import java.util.Random;
// Random  인터페이스 내장인터페이스 사용
// Scanner final이라 상속 불가능
public class MoonRandom extends Random {
	@Override
	public int nextInt(int bound) {
		
		int a = super.nextInt(bound);
		return (a % 2 == 1) ? nextInt(bound) : a;
		
	}
}
