#  1.프래그먼트 소개
![텍스트](/./img/프래그먼트소개.jpg)
#  
태블릿 같은 큰 화면에서 유연한 UI를 구현하기 위해 등장
#  
예를들어 하나의 액티비티에서 조합되어 사용되고, 핸드폰에서는 두 액티비티에서 각각의 프래그먼트를 사용할 수 있다.
#  
#  2.프래그먼트와 액티비티의 차이점
#  
-부모 자식관계를 가질 수 있다. (프래그먼트 안에 다른 프래그먼트를 포함할 수 있다.
-여러 화면에서 재사용할 수 있다.
-정리: 프래그먼트는 생명주기를 가지면서 여러 뷰를 가지고 조작하기 쉽다.
#  프래그먼트의 생명주기
#  
![텍스트](/./img/프래그먼트생명주기.jpg)
#  
#  프래그먼트의 레이아웃 생성
-onCreateView() 메서드에서 LayoutInflater로 레이아웃을 가져온다.
#  
#  프래그먼트를 사용하기 위한 화면 설계
-[xml에 프래그먼트 추가 예]

마크다운	실행결과
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="horizontal">
    
    <fragment
        android:name="Fragment1"
        android:id="@+id/list"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="1"/>

    <fragment
        android:name="Fragment2"
        android:id="@+id/list1"
        android:layout_width="0dp"
        android:layout_height="match_parent"
        android:layout_weight="2"/>
        
</LinearLayout>
```



