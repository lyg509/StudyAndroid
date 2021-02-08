# StudyAndroid
##  1.LogTest
-  Log클래스의 주요  
#  
|메서드 이름|기능|
|------|---|
|wtf(String tag, String msg)|asser 메시지|
|e(String tag, String msg)|error 메시지|
|w(String tag, String msg)|warn 메시지|
|i(String tag, String msg)|info 메시지|
|d(String tag, String msg)|debug 메시지|
|v(String tag, String msg)|verbose 메시지|
#    
#  
##  2. ActivityCycle
-  액비티비 상태
#  
|상태|설명|
|------|---|
|실행 재개( resumed)|액티비티가 화면 맨 앞에 있으며 사용자와 상호작용하고 있다.|
|일시정지(Paused)|다른 액티비티가 부분만 가리거나 반투명 액티비티가 부분 혹은 전체를 가려서 현재 액티비티가 보이는 상태이다.|
|중단(Stopped)|다른 액티비티가 완전히 가려서 현재 액티비티가 보이지 않는 상태이다.|
#  

-  콜백 메서드 다른 함수에 인수로 전달되는 함수이며, 일종의 이벤트 후에 실행될 것으로 예상된다. 콜백 메서드의 목적은 다른 클래스에서 일부 작업이 완료된 경우 클래스 Sync/Async에 알리는 것이다.

#  
#  
-  액티비티의 생명주기와 콜백 메서드
![텍스트](/./img/lifeCycle.png)
#  
#  
## 3.SaveState
-  Android에서 Bundle 이란
#  
Bundle 객체가 상태 정보를 저장한다.
따라서 Bundle icicle에 상태정보들이 저장되고, Application을 실핼때에 혹은 종료했다가 다시 불러올 때 이 Bundle icicle의 상태정보를 불러오게 된다.
#  
Bundle에서 saveInstanceState 란, 이전에 셧다운 된 후에 액티비티가 다시 초기화하는 경우, 번들은 "onSaveInstanceState(Bundle)" 메스드에 의해 가장 최근에 공급된 데이터(인스턴스)를 포함합니다.
#   
Intent를 생성하고 그를 통해 액티비티간에 객체를 전달하고 전달받음.
이때 자료형이 정해져있으면 bundle을 통해 넘기고 받고 할수 있지만, 그외 자료형의 경우 Parcel이나 Parcelable를 통해 넘기고 받아야함.
#  
#  
Bundle Class
 아래 참고 url의 레퍼런스의 설명에 보면 string 값으로 다양하게 묶을 수 있는 값들을 매핑하여 가지고 있다. Parcelable과 Cloneable 인터페이스를 implement하고 있다. 이전의 액티비티에서 새로운 액티비티로 전환되었을때 이전 액티비티의 상태에 대한 정보를 Bundle이 가지고 있다고 한다.
안드로이드는 Bundle를 통해 액티비티간의 데이터 전송 중 int, byte 같은 java의 primitive 자료형을 가지는 객체들을 별도의 작업없이 전송을 할수 있다.
# 
액티비티 전환간에 보면 아래와 같은 코드를 볼수 있다.
# 
Bundle b = getIntent().getExtras();
# 
참고 : http://developer.android.com/reference/android/os/Bundle.html
## 07 인텐트와 인텐트 필터
-  인텐트란  
#  
일종의 메시지 객체 무엇을 하려고 하는지 목적을 가지는 객체이며주로 새로운 액티비티를 시작하는 용도로 사용 (전화번호를 터치하면 전화가 걸리거나, 주소를 터치하면 지도가 열리는 등의 암시적인 동작 등)
#  
-1)액티비티 시작하기
-2)서비스 시작하기
-3)브로드캐스트 전달하기

- 명시적 인텐트와 암시적 인테트
## 명시적 인텐트
#  
- 명시적인텐트는 구성요소(액티비티, 서비스, 브로드캐스트 등)를 명시적으로 지정하는 하는 것 ex)뉴스 기사 제목이 표시되는 액티비티에서 제목을 터치하면 뉴스의 내용을 보요주는 액티비티를 호출 하는 것. 이때 명시적으로 내가 터치한 제목의 내용을 표시할 특정 액티비티를 지정해서 시작하는 것
#  
![텍스트](/./img/명시적인텐트.jpg)
#  
-암시적 인텐트
#  
수행할 작업을 지정하면, 해당 작업을 처리 할 수 있는 구성요소가 선택되어 작업을 수행
#  ![텍스트](/./img/암시적인텐트.jpg)
#  암시적 인텐트가 동작하는 과정
#  ![텍스트](/./img/암시적인텐트동작과정.jpg)
#  
1.액티비티 A가 어떤 작업이 설정된 인텐트를 생성하여 startActivity()에 전달한다.
2.안드로이드 시스템이 해당 인텐트와 일치하는 인텐트 필터를 찾아 모든 앱을 검색한다.
3.일치하는 것을 찾으면, 시스템이 일치하는 액티비티(Activity B)를 시작하기 위해 해당 액티비티의 onCreate() 메서드를 호출하여 인텐트를 전달한다.











