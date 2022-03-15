package chap10.Ex02;

class Aa{
	int m;
	void abc(){
		System.out.println("이 메시지는 클래스 Aa의 abc 메서드에서 출력됩니다.");
	}
}
class Bb extends Aa{
	int n;
	void bcd(){
		System.out.println("이 메시지는 클래스 Bb의 bcd 메서드에서 출력됩니다.");
	}
	
}

public class Inheritance_1 {

	public void main(String[] args) {
		
		// 타입 캐스팅을 하지 않는 경우
		Bb b = new Bb(); // 객체 b는 클래스 Aa, Bb 모두 포함하고 있음. 즉슨 Aa, Bb의 필드와 메소드를 모두 사용 가능한 것입니다.
		b.m = 10;
		b.n = 20;
		b.abc();
		b.bcd();
		
		//업캐스팅: 자식 => 부모
		Aa a = new Bb(); 
		a.m = 100;
		// a.n =200;
		
		System.out.println("What did I do wrong?");
	}
	
}
