##  View
#  
#  ![텍스트](/./img/view.png)
#  
#  상속 계층의 최상위에 View가 있다. 즉, 화면에 보이는 것은 모두 뷰이다.
#  상속: is a 관계가 성립해야 함
#  -Button은 View이다.
#  -CheckBox는 Button이다.
#  
##  ViewGroup
#  ![텍스트](/./img/viewgroup.png)
#  ViewGroup은 다른 View를 포함할 수 있는 View이고 레이아웃 구성에 사용한다.
#  ViewGroup 또한 View이다.
#  
#  
#  ![텍스트](/./img/xml.png)
#  레이아웃을 XML문법을 따르고 작성하는 모든 View는 Class이고 속성은 메서드에 해당한다.
#  
#  
#  XML 작성
#  ![텍스트](/./img/XML1.png)
#  
#  xmlns: 안드로이드 속성 사용시 반드시 필요
#  android: 이 namespace를 통해 속성을 사용할 수 있음
#  
#  
#  ![텍스트](/./img/layout.png)
#  layout_width(가로), layout_height(세로)는 모든 View의 필수 속성
#  다음 3가지 중 하나를 지정
#  - match_parent: 부모 크기에 맞춤
#  - wrap_content: 내용 크기만큼 늘임
#  - dp 값: 임의의 값 만큼 지정
#  
#  
#  ![텍스트](/./img/xmlResourceLoading.png)
#  main_layout,xml 레이아웃을 로딩하는 예
#  
#  
#  android:id=@id/my_button : 
#  - 고유한 id를 설정하면 이를 통해 java코드에서 참조할 수 있다.
#  XML에서 my_button 해당 id를 설정하는 방법
#  Button myButton = (Button) findViewById(R.id.my_button);
#  java코드에서 해당 id를 참조하여 변수에 할당할 수 있다.
#  
#  
#  



