package com.java.sudy;
//UI (gui,cli) interface(연결) 유저를 서비스와 연결
//자바 Interface : 가장 추상화된 설계도(누군가가 사용할 함수를 정의)
//필드를 가질수 없다. public 한 추상 함수만 정의 가능
interface A{
    int a=10;//public static final 이 생략된다.
    public static final int b=10;
    int sum();//{}바디가 없다. 함수의 구조만 있다.
    // (자동으로 접근지정자가 public )
    //int sum(int a,int b){} //그 어떤 함수도 바디를 가질 수 없다.
}
interface B{
    int sum();
    int sum(int a,int b);
}
//상속 다중 상속이 안된다.(부모(A.a=10;,B.a="안녕")가 동시에 두명일 수없다.)
//*두 부모가 같은필드를 가지고 있을 때 어떻것을 상속할지 알수가 없기 때문
//인터페이스 구현해도(implements) 부모타입이된다.
//인터페이스의 추상메서드를 구현하는 것도 오버라이드다
//인터페이스는 다중 구현이가능
//바디와 필드가 없기 때문에 인터페이스간의 구현의 우선순위를 정할 필유가 없다.
class BMWCar implements A,B{

    @Override
    public int sum() {
        return 0;
    }

    @Override
    public int sum(int a, int b) {
        return 0;
    }
}




public class L26Interface {
    //L04Interface$Anonymous
    class Anonymous implements A{
        @Override
        public int sum() {
            return 0;
        }
    }

    int a;
    public static final double PI=3.14;
    //**전연변수로 선언된 상수는 꼭 선언과 동시에 값을 대입해야한다.
    //*정보로 사용할 상수는 public static final 을 사용
    //*interface 필드를 가질 수 없기 때문에 전역변수를 선언하면
    //public static final 이 붙은 상수가 된다.

    public static void main(String[] args) {
        //바로 호출가능한 data 클래스변수밖에 없다. (static)
        System.out.println(Math.PI);
        //인터페이스를 객체로 만들수 없다.
        //인터페이스는 변수의 타입이 될 수있다.
        //A a=new A();
        //인터페이스를 객체로 만드는 방법 (익명클래스)
        //인터페이스를 객체로 생성하면서 바디를 작성하고
        //구현안된 추상클래스를 구현하면 컴파일러에게 일을 시킨다.
        //일 : 내부클래스로 익명클래스(수)를 만들어서 A를 구현하도록 시킨다.
        //*클래스 만들고 인터페스를 구현하는 것이 귀찮아서(생산성) 스킵하는 코드
        A a=new A(){
            @Override
            public int sum() {
                return 0;
            }
        };


    }
}
