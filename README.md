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
![텍스트](https://lh3.googleusercontent.com/proxy/NUOajggAeY-4_czWpK_OU4suwRW9zdm3nVHF1ty2iWYJQtB-p5a6iOBJaal3i9b-XlhNXKrwoOL42AYnkHWIVEL0Wq38HVEGL0vLuavddw12iCbEt_vuuyVs3D-z-3q82_8ti-0Djhm4k30Jv3LAqHiO3ZOt48MXQLIGC-MVODKNGMbjKmS1RmsfuOOf_YjSLpTDCe69ES5EWfl8gKtFDDdnVPsgrQbTg_uAO-Fje6A)

