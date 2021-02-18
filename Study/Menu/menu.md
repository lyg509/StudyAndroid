##  Menu
#  01 안드로이드 시스템은 옵션 메뉴, 컨텍스트 메뉴, 팝업 메뉴를 지원한다.
#  
옵션 메뉴는 앱 메뉴 키를 누르거나 우측 상단의 [...] 을 클릭하면 열린다.
#  
- 옵션 메뉴는 앱 전체에 영향을 주는 기능을 제공한다.
#  
컨텍스트 메뉴는 뷰를 길게 터치하면 열린다.
#  
- 컨텍스트 메뉴는 현재 선택한 콘텐츠에만 영향을 주는 기능을 제공한다.
#  
팝업 메뉴는 뷰를 클릭하면 열린다.
#  
-팝업 메뉴는 화면에 표시된 콘텐츠 전체에 영향을 주는 기능을 제공한다.
#  
##  02 옵션 메뉴를 정의하고 처리할 때는 onCreateOptionsMenu() 와  onOptionsItemSelected() 메서드를 재정의한다.
#  
##  03 Menu 클래스의 핵심 메서드는 add(), addSubMenu(),, findItem() 이고, Menuitem 클래스의 핵심 메서드는 getItemId(), getTtle(), setTitle()이다.
#  
##  04 컨텍스트 메뉴를 정의하고 처리할 때는 registerForContextMenu() 메서드로 뷰를 등록하고, onCreateContextMenu()와 onContextItemSelected() 메서드를 재정의한다.
#  
##  05 팝업 메뉴를 정의하고 처리할 때는 Popupmenu 메뉴 객체를 초기화하고, PopupMenu.OnMenuItemClickListener 인터페이스의 onMenuItemClick() 메서드를 재정의한다.
#  
##  06 AlertDialog를 사용하는 절차는 AlertDialog.Builder 객체 생성과 초기화하고, AlerDailog.Builder 객체에 대해 crate() 메서드 호출, 생성된 AlertDalog 객체에 대해 show() 메서드 호출 순이다.
#  
##  07 AlertDialog는 메시지 표시하기, 목록표시하기, 단인 선택 목록 표시하기, 다중 선택 목록 표시하기 등의 기능을 제공한다.
#  
##  08 날짜 대화상자는 DataPickerDialog 클래스로, 시간 대화상자는 TimePickerDialog 클래스로 기능이 제공된다. 사용자가 날짜나 시간을 선택하면 OnDataSetListener 또는 OnTimeSetListener 객체의 메서드가 호출된다.
#  
## 09 커스텀 대화상자의 화면은 XML로 대화상자 레이아웃을 정의하고 AlertDialog.Builder 객체에 대해 setView() 메서드를 호출하여 구성.


