package chap16.EX13;

// 2���� ��ǥ���� ����ؼ� ���̸� ���ϴ� ���α׷��� ����ÿ�
// ���ʸ� �޼��带 �����

class Point <X, Y>{ // ���׸� Ŭ����
	X x;
	Y y;
	
	Point (X x, Y y){ // Setter ��� �����ڸ� ���ؼ� ������ ���� �Ҵ���.
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
		
		return Math.abs(x1-x2)*Math.abs(y1-y2); // ���� ���ϱ� ���� // ���밪�� ���ϴ� ����� �˻��ؼ� ����
	}
}

public class EX_Make_Rectangle {
	public static void main(String[] args) {
		
		Point <Double, Double> p1 = new Point <Double, Double> (1.0, 2.0);
		Point <Double, Double> p2 = new Point <Double, Double> (10.0, 20.0);
		
		double rect = GenericMethod.<Double,Double> makeRectangle(p1,p2); // 
		System.out.println("�� ���� ���̴� : " + rect + "�Դϴ�"); //rect �̸����� ���� ����� ��. �ڷ����� ����
	}
}
