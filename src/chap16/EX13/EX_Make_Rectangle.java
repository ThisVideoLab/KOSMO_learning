package chap16.EX13;

// 2점의 좌표값을 사용해서 넓이를 구하는 프로그램을 만드시오
// 제너릭 메서드를 사용함

class Point <X, Y>{ // 제네릭 클래스
	X x;
	Y y;
	
	Point (X x, Y y){ // Setter 대신 생성자를 통해서 변수의 값을 할당함.
		this.x = x;
		this.y = y;
	}
	
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
}

class GenericMethod{
	public static<X,Y> double makeRectangle (Point <X,Y> p1, Point <X,Y> p2) { //
		 
		double x1 = (double) p1.getX();
		double y1 = (double) p1.getY();
		double x2 = (double) p2.getX();
		double y2 = (double) p2.getY();
		
		return Math.abs(x1-x2)*Math.abs(y1-y2); // 가로 곱하기 세로 // 절대값을 구하는 방법은 검색해서 넣음
	}
}

public class EX_Make_Rectangle {
	public static void main(String[] args) {
		
		Point <Double, Double> p1 = new Point <Double, Double> (1.0, 2.0);
		Point <Double, Double> p2 = new Point <Double, Double> (10.0, 20.0);
		
		double rect = GenericMethod.<Double,Double> makeRectangle(p1,p2); // 
		System.out.println("두 점의 넓이는 : " + rect + "입니다"); //rect 이름으로 값을 빼줘야 함. 자료형은 더블
	}
}
