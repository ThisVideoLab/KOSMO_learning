package EmployeeInfo;


/*
 
 완료 시간 : 5시까지
  
 =======사원관리 프로그램============
# 1. 사원정보 신규등록
# 2. 사원정보 검색
# 3. 사원정보 수정
# 4. 사원정보 삭제
# 5. 프로그램 종료
===============================


메뉴 입력 : 1  (번 선택하면 이 정보를 쭉 넣을수있도록)
- 사번 : 
- 이름 : 홍길동
- 연락처 : 
- 나이 :
- 부서 : 
- 직급 : 

홍길동님의 정보가 정상적으로 입력 되었습니다. 

메뉴 입력 : 2 ( 아래로 쭈욱 뜨도록)
사번	이름	연락처	나이	부서	직급

메뉴 입력 : 3 (수정할 사번을 인풋 받아서 검색 후에 수정내용을 입력함)
수정할 사번 :  
수정할 필드 선택 [1. 연락처, 2.나이, 3. 부서, 4.직급] : 

메뉴 입력 : 4
삭제할 사번 : 
홍길동 사원이 삭제 되었습니다. 

메뉴 입력 : 5
프로그램이 종료 되었습니다. 


==================================
1. TreeSet에 정보를 저장하세요.
2. 사번을 정렬해서 출력 해야 합니다.  // 컴페어 메서드로 정렬
3. 사번은 중복해서 저장되면 안됩니다. 
==================================
Emploee_info.java

class Employee {
    int empNo ; 
    String empName; 
    String phone; 
    int age; 
    String dept; 
    String compRank; 
} 
 
 */

class Employee{ // 사원의 정보를 담은 클래스
	
	private int empNo; // 사원번호
	private String empName; // 사원이름
	private String phone; // 전화번호
	private int age; // 연령
	private String depart; // 부서
	private String rank; // 직급
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	
}

public class Employee_Info {
	public static void main(String[] args) {
		
	
	
	//문서의끝
	}
}
