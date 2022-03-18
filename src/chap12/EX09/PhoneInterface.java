package chap12.EX09;

public interface PhoneInterface {
	int TIMEOUT = 10000; // public static final 이 생략된 상태
	void senCall(); // public abstract가 생략됨.
	void recieveCall(); //public abstract가 생략됨.
	default void printLogo() {
		System.out.println("로고를 출력합니다.");
	}
}
