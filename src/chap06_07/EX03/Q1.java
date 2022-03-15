package chap06_07.EX03;

class BB {
	String company;
	String model;
	String color;
	double maxSpeed;
	
	BB () {
		
		company = "현대";      // 필드(인스턴스필드) 의 company 를 알려주는 this , Heap 메모리에 저장
		model = "소나타";             // 인스턴스 : 객체화를 했을떄 사용 가능한 필드
		color = "white";       // [필드명 : 필드의 값 ] 은 Heap 영역에 저장
		maxSpeed = 100 ;
		
	}
	
	BB (String company , String model , String color, double maxSpeed){
		this.company = company;              // this 키는 객체의 필드의 변수를 뜻한다
		this.model = model;                // 3개의 변수 모두가 동일할 경우 객체의 필드의 변수를 알려주는 역활
		this.color = color;
		this.maxSpeed = maxSpeed ;
	}
	
	void work() {                 // 메소드 (인스턴스 메소드 ) : Heap영역에 메소드명과 포인터를 저장하고있다
		System.out.println(company +" "+ model + " " + color + " " + maxSpeed);
	}
		
}




public class Q1 {

	public static void main(String[] args) {
		// 생성자를 통해서 기본값을 할당 후 메모리의 내용을 work() 메소드를 사용햐서 출력.
		
		BB a = new BB();
		a.work();
		
		BB aa = new BB("기아" , "k5" , "black" , 100);
		aa.work();
		
		
		
	}

}
