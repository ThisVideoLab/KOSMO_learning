package chap16.EX06.EX1;

public class PrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter();
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaterial();	// 객체를 가져와서 powder에 할당
		System.out.println(powderPrinter);
		System.out.println(powder);
		powder.doPrinting();
		
		System.out.println("==========================");
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter();
		plasticPrinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic);
		System.out.println(plasticPrinter);
		plastic.doPrinting();
		plasticPrinter.printing();
		
		System.out.println("======================");
		
		
		// Water는 Material의 자식이 아니므로 타입에 저장할수없다
		/*
		GenericPrinter<Water> waterPrinter = new GenericPrinter();
		waterPrinter.setMaterial(new Water());
		Water water = waterPrinter.getMaterial();
		
		System.out.println(water);
		System.out.println(waterPrinter);
		water.doPrinting();
		*/
	}

}
