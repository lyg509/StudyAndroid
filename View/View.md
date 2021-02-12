##  View
#  
#  ![텍스트](/./img/view.png)
#  
#  
상속 계층의 최상위에 View가 있다. 즉, 화면에 보이는 것은 모두 뷰이다.
#  
상속: is a 관계가 성립해야 함
#  
-Button은 View이다.
#  
-CheckBox는 Button이다.
#  
##  ViewGroup
#  ![텍스트](/./img/viewgroup.png)
#  
ViewGroup은 다른 View를 포함할 수 있는 View이고 레이아웃 구성에 사용한다.
#  
ViewGroup 또한 View이다.
#  
#  
#  ![텍스트](/./img/xml.png)
#  
레이아웃을 XML문법을 따르고 작성하는 모든 View는 Class이고 속성은 메서드에 해당한다.
#  
#  
#  XML 작성
#  ![텍스트](/./img/XML1.png)
#  
#  
xmlns: 안드로이드 속성 사용시 반드시 필요
#  
android: 이 namespace를 통해 속성을 사용할 수 있음
#  
#  
#  ![텍스트](/./img/layout.png)
#  
layout_width(가로), layout_height(세로)는 모든 View의 필수 속성
#  
다음 3가지 중 하나를 지정
#  
- match_parent: 부모 크기에 맞춤
#  
- wrap_content: 내용 크기만큼 늘임
#  
- dp 값: 임의의 값 만큼 지정
#  
#  
#  ![텍스트](/./img/xmlResourceLoading.png)
#  
main_layout,xml 레이아웃을 로딩하는 예
#  
#  
#  android:id=@id/my_button : 
#  
- 고유한 id를 설정하면 이를 통해 java코드에서 참조할 수 있다.
#  
XML에서 my_button 해당 id를 설정하는 방법
#  
Button myButton = (Button) findViewById(R.id.my_button);
#  
java코드에서 해당 id를 참조하여 변수에 할당할 수 있다.
#  
#  
#  패딩과 마진
#  ![텍스트](/./img/paddingAndMargine.png)
#
#  dp
#  
dp 단위는 서로 다른 해상도나 밀도를 가진 기기 간에도 동일한 크기로 보이게 하는 단위이다.
#  
#  LinearLayout 
#  
가장 많이 사용하는 레이아웃
#  
View들을 수평(horizontal)또는 수직(vertical)로만 배치할 수 있다.
#  
#  EditText
#  
문자열을 입력할 수 있는 뷰
#  
#  문자열 리소스 추가
# 
string.xml 에 정의 
```xml
<resources>
  <string name="app_name">MyApp</string>
</resources>
```
#  
#  EditText를 남는 영역이 없도록 채우기
#  
```xml
android:layout_weight="1"
android:layout_width="0dp"
```
#  
#  버튼 클릭
```xml
android:onClick="sendMessage"
```
```java
public void sendMessage(View view){
}
```
#  
##  인텐트 작성
```java
Intent intent = new Intent(this, DisplayMessageActivity.class);
EditText editText = (EditText) findViewById(R.id.edit_message);
String message = editText.getText().toString();
intent.putExtra(EXTRA_MESSAGE, message);
startActivity(intent);
```
#  
#  
Intent: 무엇을 하겠다는 의도를 담는 객체
#  
간단한 데이터를 putExtra()를 통해 담을 수 있다.
#  
인텐트를 작성후 startActivity를 호출하면 다른 액티비티를 화면에 표시할 수 있다.
#  
#  java코드로 레이아웃을 동적으로 변경 하는 예
```java
Intent intent = getIntent();
String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
TextView textView = new TextView(this);
textView.setTextSize(40);
textView.setText(message);

ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);
layout.addView(textView);

```











