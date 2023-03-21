
public class RSPMain_teacher {
    public static void main(String[] args) {
        Referee r = new Referee(); //심판
        Enemy e = new Enemy();	// 컴퓨터
        User u = new User(); // 사용자
        
        r.start(u, e);
    }
}