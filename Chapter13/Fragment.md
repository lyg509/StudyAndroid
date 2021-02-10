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
#
자바 코드로 추가
-프래그먼트를 추가하려면 프래그먼트를 배치할 뷰그룹이 하나 필요(위 XML에서 아이디에 fragment, container를 가지는 LinearLayout)
#  
, 프로그래먼트 추가,제거,교체를 동적으로 수행하려면 FragmentManager 객체가 필요하다. 또한, 이 객체를 얻으려면
#  
getFragmentManager()나 getSuppoetFragmentManager()메서를 사용해야한다.
#  
프래그먼트의 추가,제거,교체는 한 번에 여러 가지를 동시에 수행할 수 있고, 이때 한 번에 수행하는 작업의 집합을 트랜잭션이라고 한다.
트랜잭션의 끝에 commit()메서드를 호출하면 작업 내용들이 적용된다.
#  
-[Fragment의 동적 추가 예]
```java
FragmentManager fragmentManager = getSupportFragmentmanager();
FragmentTransaction fragmentTransaction = fragmentManager.begubTrabsaction();

ExampleFragment fragment = new ExampleFragment();
fragmentTransaction.add(R.id.gragment_container, fragement);
fragmentTransaction.commit();
```


