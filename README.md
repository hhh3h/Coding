
# JAVA
![JAVA](http://wikidocs.net/images/page/256/compile.png)
* 자바는 JVM이라는 중간단계가 있으므로 C등의 언어보다 속도가 느리다. 하지만 한번 작성한 파일은 어떤 OS에서라도 사용할 수 있다는 장점이 있다.
 * .class 파일은 jvm만 해석가능한 바이너리코드이다
 * 클래스 내의 함수는 보통 함수라고 말하지 않고 메소드라고 한다. 자바는 모든것이 클래스기반이므로 자바에서 사용되는 함수는 모두 메소드라고 부르면 될 것이다.
 ``` java
 package jump2java;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Hello World");
    }
}
 ```
* public : 메소드의 접근제어자, public은 누구나 이 메소드에 접근할 수 있다는 의미
* static : 메소드에 static 이 지정되어 있는 경우 이 메소드는 인스턴스 생성없이 실행 할 수 있음을 의미
* void : 메소드의 리턴값이 없음(void: 사전적으로 "텅 빈" 이라는 뜻)을 의미
* args[] : String 자료형에 대한 변수명으로 args 뒤에 []가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열임을 의미
* long 변수에 값을 대입할 때는 대입하는 숫자 값이 int 자료형의 최대값인 2147483647 보다 큰 경우 8764827384923849L과 같이 L 접미사(또는 소문자 l, 소문자 'l'은 숫자 1과 비슷하게 보이므로 추천하지 않는다.)를 붙여 주어야 한다. 만약 'L'과 같은 접미사를 누락하면 컴파일 에러가 발생한다.
* 자바에서 실수형은 디폴트가 double이므로 위의 예에서 보듯이 float 변수에 값을 대입할 때에는 3.14F 와 같이 F접미사(또는 소문자 f)를 꼭 붙여 주어야 한다. float 자료형에 값을 대입할 때 접미사를 누락하면 컴파일 에러가 발생한다.
``` java
float pi = 3.14F;
double morePi = 3.14159265358979323846;
```
* 한 개의 문자 값에 대한 자료형은 char 를 이용한다.
* int, long, double, float, boolean, char 등을 자바는 primitive 자료형 이라고 부른다. 이런 primitive 자료형은 new 키워드로 생성할 수 없다.
* 자바는 class가 없이 사용할 수 없기에 함수는 없고 다 메쏘드이다. Python는 함수도 있고 메쏘드도 있다.
* 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다. C++, 파이썬 등 많은 언어들이 다중 상속을 지원하지만 자바는 다중 상속을 지원하지 않는다. 
### substring
* substring은 문자열 중 특정 부분을 뽑아낼 경우에 사용한다.
``` java
String a = "Hello Java";
System.out.println(a.substring(0, 4));

// Hell
```
### StringBuffer 
* StringBuffer는 문자열을 추가하거나 변경 할 때 주로 사용하는 자료형이다.
``` java
public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("jump to java");
        System.out.println(sb.toString());
    }
}

// hello jump to java
```
* String 자료형은 한번 값이 생성되면 그 값을 변경할 수가 없다. 이렇게 값을 변경할 수 없는 것을 immutable 하다고 한다. trim, toUpperCase 등의 메소드를 보면 문자열이 변경되는 것 처럼 생각 될 수도 있겠지만 해당 메소드 수행 시 또 다른 String 객체를 생성하여 리턴할 뿐이다. StringBuffer 는 이와 반대로 값을 변경할 수 있다(mutable 하다). 즉 한번 생성된 값을 언제든지 수정할 수 있다.
``` java
String[] weeks = new String[];    // 길이값이 없으므로 컴파일 오류가 발생한다.
```
* 배열은 크기가 정해져 있다. 예를 들어 배열의 크기를 10개로 정했다면 10개 이상의 값을 담을 수는 없다. 다만 리스트는 상관없다.
``` java
import java.util.ArrayList;

public class TestList {
    public static void main(String[] args) {
        ArrayList<String> pitches = new ArrayList<String>();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");

        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));

        System.out.println(pitches.remove("129"));
        System.out.println(pitches.size());
        System.out.println(pitches.remove(0));
    }
}
```
### 제네릭스 (Generics)
``` java
ArrayList<String> aList = new ArrayList<String>();
```
``` java
ArrayList aList = new ArrayList();
aList.add("hello");
aList.add("java");

String hello = (String) aList.get(0);
String java = (String) aList.get(1);
```
* 제네릭스를 사용하지 않을 경우에는 ArrayList 안에 추가되는 객체는 Object 자료형으로 인식된다. Object 자료형은 모든 객체가 상속하고 있는 가장 기본적인 자료형이다. 따라서 ArrayList 객체인 aList에 값을 넣을 때는 문제가 안되지만 값을 가져올 경우에는 항상 Object 자료형에서 String 자료형으로 다음과 같이 형변환(casting)을 해 주어야만 한다.
### Map
* 맵(Map)은 사전(dictionary)과 비슷하다.
### for each
``` java
String[] numbers = {"one", "two", "three"};
for(String number: numbers) {
    System.out.println(number);
}
```
### 객체와 인스턴스
```
※ 객체와 인스턴스
클래스에 의해서 만들어진 객체를 인스턴스라고도 한다. 그렇다면 객체와 인스턴스의 차이는 무엇일까? 이렇게 생각 해 보자. Animal cat = new Animal() 이렇게 만들어진 cat은 객체이다. 그리고 cat이라는 객체는 Animal의 인스턴스(instance)이다. 즉 인스턴스라는 말은 특정 객체(cat)가 어떤 클래스(Animal)의 객체인지를 관계위주로 설명할 때 사용된다. 즉, "cat은 인스턴스" 보다는 "cat은 객체"라는 표현이 "cat은 Animal의 객체" 보다는 "cat은 Animal의 인스턴스" 라는 표현이 훨씬 잘 어울린다.
과자틀 → 클래스 (Class), 과자틀에 의해서 만들어진 과자들 → 객체 (Object)
```
### Call by value
``` java
class Updator {
    public void update(Counter counter) {
        counter.count++;
    }
}

public class Counter {
    int count = 0;
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updator myUpdator = new Updator();
        myUpdator.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}

// before update:0
// after update:1
```
### IS-A 관계
* Dog클래스는 Animal클래스를 상속받았다. 즉 "Dog is a Animal" 과 같이 말할 수 있는 관계를 IS-A 관계라고 한다.
```
자바에서 만드는 모든 클래스는 Object라는 클래스를 상속받게 되어 있다. 사실 우리가 만든 Animal 클래스는 다음과 기능적으로 완전히 동일하다. 하지만 굳이 아래 코드처럼 Object 클래스를 상속하도록 코딩하지 않아도 자바에서 만들어지는 모든 클래스는 Object 클래스를 자동으로 상속받게끔 되어 있다.
public class Animal extends Object {
    String name;

    public void setName(String name) {
        this.name = name;
    }
}
따라서 자바에서 만드는 모든 객체는 Object 자료형으로 사용할 수 있다. 즉, 다음과 같이 코딩하는 것이 가능하다.
Object animal = new Animal();
Object dog = new Dog();
```
### 메쏘드 오버라이딩 vs 메쏘드 오버로딩
* 메쏘드 오버라이딩: 부모의 메쏘드를 변경
* 메쏘드 오버로딩: 부모와 입력항목이 다른 경우 동일한 이름의 메소드를 만듬
### 생성자(Constructor)
* 클래스명과 동일하며 리턴타입을 정하지 않는다.
``` java
public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    } 
    ...
```
### 인터페이스
* 현실세계의 usb와 동일하다.
|물리적세계|자바세계|
|컴퓨터|ZooKeeper|
|USB 포트|Predator|
|하드디스크, 디지털카메라,...|Tiger, Lion, Crocodile,...|
### 다형성
* 하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것을 객체지향 세계에서는 다형성, 폴리모피즘(Polymorphism)이라고 부른다
``` java
public class Lion extends Animal implements Predator, Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}
```
```
Tiger tiger = new Tiger();
Animal animal = new Tiger();
Predator predator = new Tiger();
Barkable barkable = new Tiger();
```
### 추상클래스
* 추상클래스에 abstract 로 선언된 메소드(getFood 메소드)는 인터페이스의 메소드와 마찬가지로 추상클래스를 상속하는 클래스에서 반드시 구현해야만 하는 메소드이다.
### 스트림
```
스트림(Stream)이란?
스트림을 가장 쉽게 이해하려면 수도꼭지를 생각하면 된다. 수도꼭지를 틀면 물이 나오고 수도꼭지를 잠그면 물이 나오지 않는다. A라는 곳에서부터 B라는 곳까지 수도관이 연결되어 있고 A에서 계속 물을 보낸다면 B에서 수도꼭지를 틀때마다 물이 나오게 될 것이다. 여기서 스트림은 A수도관에서 B수도관으로 이동하는 물의 흐름이라고 할 수 있다.
프로그래밍에서는 다음과 같은 것들을 스트림이라고 할 수 있다.
* 파일 데이터 (파일은 그 시작과 끝이 있는 데이터의 스트림이다.)
* HTTP 응답 데이터 (브라우저가 요청하고 서버가 응답하는 HTTP 응답 데이터도 스트림이다.)
* 키보드 입력 (사용자가 키보드로 입력하는 문자열은 스트림이다.)
```
### 접근제어자
* private < default < protected < public 순으로 보다 많은 접근을 허용한다.
#### private
* private 이 붙은 변수, 메소드는 해당 클래스에서만 접근이 가능하다.
#### default
* 접근제어자를 별도로 설정하지 않는다면 접근제어자가 없는 변수, 메소드는 default 접근제어자가 되어 해당 패키지 내에서만 접근이 가능하다.
#### protected
*  protected가 붙은 변수, 메소드는 동일 패키지내의 클래스 또는 해당 클래스를 상속받은 외부 패키지의 클래스에서 접근이 가능하다.
#### public
* public 접근제어자가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다.
### 정적변수(static)
* static 키워드를 붙이면 자바는 메모리 할당을 딱 한번만 하게 되어 메모리 사용에 이점을 볼 수 있게된다.
* static을 사용하는 또 한가지 이유로 공유의 개념을 들 수 있다. static 으로 설정하면 같은 곳의 메모리 주소만을 바라보기 때문에 static 변수의 값을 공유하게 되는 것이다. 다음의 예를 보면 더욱 명확하게 파악할 수 있을 것이다.
