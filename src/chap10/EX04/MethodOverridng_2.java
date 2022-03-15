package chap10.EX04;


class Animalz{
	void run(){
	
		
	}
}

class Tiger extends Animalz{ // 
	@Override
	void run (){
		System.out.println(" 호랑이는 네 발로 달립니다.");
	}
	void TigerEat() {
		System.out.println("호랑이는 동물을 먹습니다.");
	}
}

class Eagle extends Animalz{ // 
	@Override
	void run (){
		System.out.println(" 독수리는 하늘로 날아다닙니다");
	}
	void EagleEat() {
		System.out.println("독수리는 쥐를 잡아먹습니다.");
	}
}

class Snake extends Animalz{ // 
	@Override
	void run (){
		System.out.println(" 뱀은 땅을 기어다닙니다.");
	}
	void SnakeEat() {
		System.out.println("뱀은 쥐를 잡아먹습니다.");
	}
}

public class MethodOverridng_2 {

	public static void main(String[] args) {

		// 업 캐스팅으로 생성
		
		Animalz aa = new Tiger();
		Animalz bb = new Eagle();
		Animalz cc = new Snake();
		
		System.out.println("=====오버라이딩 출력=====");
		// 오버라이딩 출력		
		
		aa.run();
		bb.run();
		cc.run();
		System.out.println();
		
		
		// 배열에 입력
		
		Animalz[] animalz = {aa, bb, cc};
		
		
		System.out.println("=====for 문으로 출력=====");
		//  for문으로 출력
		
		for (int z =0 ; z < animalz.length; z++) {
			animalz[z].run();
		}
		System.out.println();
		
		// 인스턴스 오브 사용해서 거기에 있는 메소드 2개만 출력
		
		System.out.println("=====향상된 for문으로 출력=====");
		// 향상된 for문으로 출력
		
		for (Animalz z : animalz) {
			z.run();
		}
		System.out.println();
		
		
		// 다운캐스팅으로 eat 메소트 출력
		System.out.println("=====다운캐스팅으로 eat 매소드 출력=====");
		
		Tiger aa_down = (Tiger) aa;
		Eagle bb_down = (Eagle) bb;
		Snake cc_down = (Snake) cc;
		
		if (aa instanceof Tiger) {
			aa_down.TigerEat();
		} 
		if (bb instanceof Eagle) {
			bb_down.EagleEat();
		}
		if (cc instanceof Snake) {
			cc_down.SnakeEat();
		}
		
	}

}
