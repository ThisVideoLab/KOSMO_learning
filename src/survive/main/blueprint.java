package survive.main;




public class blueprint {
	public static void main(String[]args) {

/* 스토리 
 /KOSMO_learning/src/chap19/EX04/FileInputStream_basic.java
 인풋 스트림 참고해서 스토리 파일 따로 작성한 뒤에 불러와보자 이때 경로는 반드시 상대경로를 사용할 것
 
 */
		
		
/* 스텟	
 스텟 구성 : 근력, 체력(지구력, 생명력), 민첩성, 지능
스텟 개요 : 스텟의 적극적인 활용. 전투 뿐만 아니라 이동 및 제작, 전반에 걸쳐서 영향을 주도록 만들자
		  사실 간단한 작업만해도 위 스텟이 복합적으로 작용하는게 사실임. 고로 별도의 파라메터를
		  적용하지 말고 모든 작업들은 이 스텟의 총합에 따라서 시간이 경감될 수 있도록 넣어주자
		  곰빵만해도 체력, 근력, 민첩성은 당연 중요하고 심지어 일머리에 따라서도 결과가 확 달라짐 
*/		

/* 컨디션
 질병으로 인한 컨디션
 기본 컨디션
 날씨 컨디션
 
 */
		
/* 음식
음식에 따라서 상이한 것 수치를 구현하면 될듯 반드시 + 만 있다고 생각하지 말자
음식에 따라서는 갈증을 유발하는 음식들도 어느정도 있으니, 통념에 맞춰서 그에 해당하는 
음식들을 몇가지 구비해서 이러한 발상의 포인트만 보여줄 수 있도록 구성할 것

포만감
체수분
 */
		
/*시간
 생존 : 년 월 일 시 정도로 표시
 시계를 얻으면 정확한 시간 표현됨
 시계가 없으면 대충 시간의 구간을 나눈뒤에 그 구간에 대고 표현
 --------------------------
 동이 터오는 것을 보니 새벽인듯하다.
 새소리가 활발하고 공기가 가라앉은 것을 보아하니 아침인듯하다.
 그림자를 보니 정오에 가까워진듯 하다.
 해가 늬엿한걸 보니 곧 저녁이다.
 한치앞도 안보이는것을 보니 한 함이다.
 -------------------------------
 
 기본 - 
 
 휴식 - 지구력 체력 회복, 일정 확률로 상태이상 회복? will see
 
 취침 - 지구력 체력 회복, 일정 확률로 상태이상 회복? will see
 
 작업 - 각작업간에 상이하게 할당할 것
 
 이동 - 걷기 ( 지구력 소모 없음)
 	 - 달리기 ( 지구력 소모됨)
 	 - 이동 속도 
 	 
 밤낮 - 밤에는 좀비 나올 확률이 증가됨. 
 */
		
/* 전투
   평타 -> 회피 => 강타 -> 방어 => 평타 순서로 베네핏을 가짐 = 으로 표현된 부분에서는 카운터 발생의 확률이 존재함.  
   상황
   발견(지능) - 은신(지능) - 도주(민첩) - 전투(복합)의 상황으로 나뉨.
 */
		
/* 몬스터
 들개
 맷돼지
 생존자
 좀비
 */
		
/* 노동
 * <생산>
  벌목 - 가공 - 목재
  채광 - 가공 - 금속
  진흙 - 가공 - 점토
  채집 - 가공 - 음식
  강물 - 가공 - 식수
  
  <제작>
   
 */
	
		
// -----추가하면 좋을것들---------------------------------------
		
/* 계절
  계절에 따라 다양한 환경이 변화함에 따라서 , 그에 맞춘 객체들이 등장하면 좋을듯 함
  가령 채집시에 획득 가능한 식물들과 과일들의 Set table에 추가를 하는 식으로
  아예 기본 basic set 주고 winter season Set처럼 나눠서 절기 바뀌면
  current Set clear로 날려주고 다시 basic + 해당 계절 셋 담아서 스폰 테이블
  짜주면 좋을듯 함. 근데 아마 우린 안될꺼야
  
  계절에 따라 영향 받을 수 있는 요소들
  일출 일몰
  날씨
  식생
  질병
 
스킬 숙련도
		
		
 수첩? 시간남으면

칼로리와 체중-
체중 펙터를 넣으려면 어쩔 수 없이 모든 음식에 대해서 칼로리 값을 부여해주고, 하루의 기초 대사량을 설정한 뒤에
기초 대사량과 칼로리 섭취에 따른 값을 따로 주어야 한다는 점이 어려움. 다만 이를 통해서 상태이상에 굶주림을 넣을 수 있게 됨.
여기서 심화하면 각 액션이나 작업, 이동 거리등을 계산해서 이를 바탕으로 한 칼로리 소모량을 직접 설정해 줄 수 있지만
소요될 시간이 많을 것으로 예상됨.

*/
		
	//문서의끝
	}
}
