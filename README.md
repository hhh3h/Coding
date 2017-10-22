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
