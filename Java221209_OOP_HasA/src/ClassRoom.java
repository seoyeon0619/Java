
public class ClassRoom {
	String name;
	int seat;
	static Coffee machine = new Coffee("커피머신", 50); 
	//모든 강의실이 한 대 뿐인 커피머신 사용
	
	public ClassRoom() {
		// TODO Auto-generated constructor stub
	}

	public ClassRoom(String name, int seat) {
		super();
		this.name = name;
		this.seat = seat;
	}
}
