
public class CSMain3 {
	public static void main(String[] args) {
		String role = "DBP(programmer)";
		
		switch (role) {
		case "DBA(admin)":
			System.out.println("전원관리, 백업/복구");
		case "DBP(programmer)":
			System.out.println("CRUD(Create Read Update Delete)");
		default:
			//DBU(user)
			System.out.println("DB서비스 사용");
			break;
		}
	}
}
