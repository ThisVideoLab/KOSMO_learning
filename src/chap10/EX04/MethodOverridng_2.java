package chap10.EX04;


class Animalz{
	void run(){
	
		
	}
}

class Tiger extends Animalz{ // 
	@Override
	void run (){
		System.out.println(" ȣ���̴� �� �߷� �޸��ϴ�.");
	}
	void TigerEat() {
		System.out.println("ȣ���̴� ������ �Խ��ϴ�.");
	}
}

class Eagle extends Animalz{ // 
	@Override
	void run (){
		System.out.println(" �������� �ϴ÷� ���ƴٴմϴ�");
	}
	void EagleEat() {
		System.out.println("�������� �㸦 ��ƸԽ��ϴ�.");
	}
}

class Snake extends Animalz{ // 
	@Override
	void run (){
		System.out.println(" ���� ���� ���ٴմϴ�.");
	}
	void SnakeEat() {
		System.out.println("���� �㸦 ��ƸԽ��ϴ�.");
	}
}

public class MethodOverridng_2 {

	public static void main(String[] args) {

		// �� ĳ�������� ����
		
		Animalz aa = new Tiger();
		Animalz bb = new Eagle();
		Animalz cc = new Snake();
		
		System.out.println("=====�������̵� ���=====");
		// �������̵� ���		
		
		aa.run();
		bb.run();
		cc.run();
		System.out.println();
		
		
		// �迭�� �Է�
		
		Animalz[] animalz = {aa, bb, cc};
		
		
		System.out.println("=====for ������ ���=====");
		//  for������ ���
		
		for (int z =0 ; z < animalz.length; z++) {
			animalz[z].run();
		}
		System.out.println();
		
		// �ν��Ͻ� ���� ����ؼ� �ű⿡ �ִ� �޼ҵ� 2���� ���
		
		System.out.println("=====���� for������ ���=====");
		// ���� for������ ���
		
		for (Animalz z : animalz) {
			z.run();
		}
		System.out.println();
		
		
		// �ٿ�ĳ�������� eat �޼�Ʈ ���
		System.out.println("=====�ٿ�ĳ�������� eat �żҵ� ���=====");
		
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
