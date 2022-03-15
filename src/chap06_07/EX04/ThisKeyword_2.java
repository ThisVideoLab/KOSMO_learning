package chap06_07.EX04;

// 명시적 this 키워드 추가
class Aa {                    //  this 키를 사용하지 않는 경우 : 지역변수로 인식
	int m ;
	int n ; 
	void init (int m , int n ) {			// 지역변수 m , n
		m = m;                         // this 키를 사용하지 않는 경우 m <== 지역변수 m
		n = n;						   // this 키를 사용하지 않는 경우 n <== 지역변수 n
	}
	
	
}


class Bb{                     // this 키를 사용하는 경우
	
	int m ;
	int n ;
	void init ( int m , int n ) {
		this.m = m;                  // this 키를 사용하는 경우 m <==  필드 m
		this.n = n;					 // this 키를 사용하는 경우 n <==  필드 n
	}
	
}



public class ThisKeyword_2 {

	public static void main(String[] args) {
		//1. 필드의 명과 지역변수의 명이 같은 경우  (this키워드를 사용하지 않는 경우 : 지역변수에 저장 )
		
		Aa aa = new Aa();
		aa.init(2,3);
		System.out.println(aa.m);
		System.out.println(aa.n);
		
		//2. 필드의 명과 지역변수의 명이 같을 경우  (this키워드를 사용하는 경우 : 필드에 저장 )
		Bb bb = new Bb();
		bb.init(2, 3);
		System.out.println(bb.m);
		System.out.println(bb.n);

	}

}
