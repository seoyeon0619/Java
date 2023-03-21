
public class Doctor {
	public Guest callGuest() {
		return new Guest();
	}

	public void ask(Guest g) { // Guest g로 데이터를 묶어서 다녀랏
		System.out.print("이름 : ");
		g.name = g.tellName();

		System.out.print("키 : ");
		g.height = g.tellHeight();
		if (g.height > 3) {
			g.height /= 100;
		}

		System.out.print("몸무게 : ");
		g.weight = g.tellWeight();
		// 어차피 같은 주소를 사용하므로
		// 참조형에 굳이 return 쓸 필요 없음
	}

	public void calculate(Guest g) {
		g.bmi = g.weight / (g.height * g.height);
		// 계산했더니 Bmi가 나오더라
	}
	
	public void judge(Guest g) {
		if (g.bmi >= 35) {
			g.status =  "고도비만";
		} else if (g.bmi >= 30) {
			g.status = "중도비만";
		} else if (g.bmi >= 25) {
			g.status = "경도비만";
		} else if (g.bmi >= 23) {
			g.status = "과체중";
		} else if (g.bmi >= 18.5) {
			g.status = "정상";
		} else
			g.status = "저체중";
	}
	
	//출력하는 메소드 따로 생성
	public void tellResult(Guest g) {
		System.out.printf("BMI : %.1f\n", g.bmi);
		System.out.printf("%s님은 %s\n", g.name, g.status);
	}
	// 실질적인 main 역할 (불러오기만 하는)
		public void start() {
			Guest g = callGuest();
			ask(g);
			calculate(g);
			judge(g);
			tellResult(g);
		}
}
