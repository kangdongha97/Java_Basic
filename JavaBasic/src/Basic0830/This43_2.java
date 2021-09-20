package Basic0830;

//ex43 - 2 this의 용법)
class Tiger43_2{
	//Tiger this;
	//Tiger(Tiger t){
	//	this = t;
	//}
	int x, y;
	int size;
	// 소스 > 제너레이터 컨스트럭터 유징 필드 > 생성자 만들어줌
	Tiger43_2(int x, int y, int size){ //가독성 중요
		this.x = x; // 필드 x = 전달인수 x 서로를 구분하기 위해 this 사용
		this.y = y; 
		this.size = size;
	}
	void show() {
		System.out.println(this.x + " " + this.y + " " + this.size);
	}
}
public class This43_2{
	
	public static void main(String[] args) {
		Tiger43_2 t1 = new Tiger43_2(10, 20, 30);
		int num = 10;
		//num = num; // 자기 대입, 쓸모없음
		t1.show();
	}
}
