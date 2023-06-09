package com.java.sudy;

import java.util.Arrays;
import java.util.Objects;

//생성자 : 객체의 필드값 대입(초기화)를 강제하기 위해 존재
class Animal{
    String name;
    String [] legs;
    String mouth;
    int tail;
    public Animal(String name) {
        this.name = name;
    }
    public String drink(String a){
        System.out.println(name+"이 "+a+"을(를) 마신다.");
        return "오줌";
    }
    //final 변수 : 상수
    //final 함수 : 오버라이드 할수 없는 함수
    public String drink(){
        System.out.println(name+"이 물을 마신다.");
        return "오줌";
    }

//    @Override
//    public String toString() {
//        return "동물의 이름은 "+this.name;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return tail == animal.tail && Objects.equals(name, animal.name) && Objects.equals(mouth, animal.mouth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + Arrays.toString(legs) +
                ", mouth='" + mouth + '\'' +
                ", tail=" + tail +
                '}';
    }
}
//class Dog{}//패키지 안에 같은 이름의 클래스가 2개 있을 수없다.
class Giraffe extends Animal{
    public Giraffe(String name) {
        //this super 필드접근
        //this(), super() : 생성자 실행
        super(name); //this.name=name;
    }
    //@ :어노테이션
    //=>컴파일할때(저장,javac) @이 있는 대상을 검사하거나 자동구현하는 기능
    //@Override : 부모의 함수를 재정의하는지 검사해서 컴파일
    //만약 부모의 함수중에 같은 이름이 없으면 오버라이드 대상이 아니라서 오류

    //오버라이드
    //=>부모의 함수를 자식이 재정의 하는 것
    //=>보무 자식이 같은 이름의 함수를 가지고 있지만 자식의 함수만 호출되기 때문에
    //오바러이드라고하고 하나의 이름으로 2개의 역할을 가지고 있기 때문에 다형성

    @Override
    public String drink(String a) {
        System.out.print("목을 내려서 ");
        return super.drink(a);
    }
    public int neckAttack(){
        System.out.println(name+"이 목을 휘두른다.");
        return 7;
    }
}
class hippo extends Animal{
    public hippo(String name) {
        super(name);
    }
}
class Zebra extends Animal{
    //상속하는 대상을 부모 (super)
    //상속받는 대상을 자식 (this)
    //자식은 부모의 필드를 물려받는다. 부모의 재산은 내거!(this 로 접근 가능)
    //생성자를 정의하면 default 생성자가 만들어지지 않는다.(생성시 초기화를 강제)
    //public Zebra(){}
    public Zebra(String name){
        super(name);
    }
}

public class L25Inheritance2 {
    //계획 동물의 특징!!!
    public static void main(String[] args) {
        //Zebra 객체를 만들어서 우유를 마시게 하세요.
        Zebra zebra=new Zebra("세로 얼룩말");
        //zebra.name="얼룩말";
        String a=zebra.drink("우유");
        a+=zebra.drink("물");
        System.out.println(a);

        Giraffe giraffe=new Giraffe("목긴 기린");
        giraffe.drink("물");
        int attack=giraffe.neckAttack();
        System.out.println("얼룩말이 "+attack+" 데미지를 입는다.");
        //변수 : data 를 재상용하기 위해 참조하는 것
        //타입의 다형성
        //객체를 참조하는 변수는 부모타입이 될 수 있다.
        //==객체는 여러 부모타입으로 참조될 수 있다.
        //==>객체가 부모타입에 참조되면 객체는 바뀌나??
        //다형성 :오버로드,오버라이드,타입
        Animal giraffe2=new Giraffe("목 짧은 기린");
        giraffe2.drink("에너지 드링크");
        //해당 변수는 정의된 타입의 맴버만 호출가능(Animal)
        //giraffe2.attact();
        //Object : 자료형 타입의 근원
        //자료형 타입(class)을 정의하면 무조건 Object 상속받게 된다.
        //재정의용 함수 2개
        //equals(data) : 두개의 자료가 같은지 비교 (재정의 하지 않으면 동작하지 않아)
        //toString() : 객체 설명서 (default : 클래스명+해시코드)

        Object o=giraffe2;
        System.out.println(o.toString());
        //변수 o 가 Giraffe.neckAttack() 을 사용하려면 어떻게 해야하나??
        System.out.println(((Giraffe)o).neckAttack());
        //캐스팅형변환
        //변수가 객체의 부모타입을 참조하고 있을때 자식 타입을 참조하는 방법
        Giraffe g=(Giraffe) o;
        Zebra z=(Zebra) o; //객체가 관련없는 타입으로 변환하면 오류

    }
}
