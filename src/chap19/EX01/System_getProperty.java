package chap19.EX01;

public class System_getProperty {
	public static void main(String[] args) {
	
		//System.getProperty() �޼����� ������ ������
		
		System.out.println(System.getProperty("user.dir")); // ���� �۾� ���丮�� �����
		System.out.println(System.getProperty("java.version")); // ���� java�� ���� ���
		System.out.println(System.getProperty("java.vendor"));
		System.out.println(System.getProperty("java.vendor.url"));
		System.out.println(System.getProperty("java.home")); // java ��ġ Ȩ����
		System.out.println(System.getProperty("java.class.version"));
		System.out.println(System.getProperty("java.class.path"));
		System.out.println(System.getProperty("user.name")); // �α׿��� ����
		System.out.println(System.getProperty("user.home")); // Ȩ����
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("os.arch"));
		System.out.println(System.getProperty("os.version"));
		System.out.println(System.getProperty("file.seperator"));
		System.out.println(System.getProperty("path.separator"));
		System.out.println(System.getProperty("line.separator"));
		
    //�����ǳ�
	}
}
