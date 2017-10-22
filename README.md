
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
---
※ 객체와 인스턴스
클래스에 의해서 만들어진 객체를 인스턴스라고도 한다. 그렇다면 객체와 인스턴스의 차이는 무엇일까? 이렇게 생각 해 보자. Animal cat = new Animal() 이렇게 만들어진 cat은 객체이다. 그리고 cat이라는 객체는 Animal의 인스턴스(instance)이다. 즉 인스턴스라는 말은 특정 객체(cat)가 어떤 클래스(Animal)의 객체인지를 관계위주로 설명할 때 사용된다. 즉, "cat은 인스턴스" 보다는 "cat은 객체"라는 표현이 "cat은 Animal의 객체" 보다는 "cat은 Animal의 인스턴스" 라는 표현이 훨씬 잘 어울린다.
---
