# 용어 정리

> 1. JVM
>     - Java Virtual Machine의 줄임말
>     - OS에 종속적이지 않은 자바를 인식, 실행하기 위한 가상 기계(컴퓨터)
>     - Java 소스코드는 CPU가 인식하지 못 하므로 기계어로 컴파일을 해주어야 하는데 JVM을 거쳐 OS에 도달하기 때문에 (OS가 인식할 수 있는 기계어로 바로 컴파일 되는 것이 아닌) Java compiler가 .java 파일을 JVM이 인식할 수 있는 Java byte code(.class)로 변환함, 그 이후 JVM이 OS가 byte code를 이해할 수 있도록 해석해 줌
>     - Java compiler : JDK 설치하면 bin에 존재하는 Javac.exe (JDK 내에 java compiler가 포함)

> 2. OOP
>     - Object Oriented Programming
>     - 객체들의 유기적인 관계를 통해서 프로세스가 진행됨
>     - 애플리케이션을 구성하는 요소들을 객체로 바라보고, 객체들을 유기적으로 연결하여 프로그래밍
>     - 특징 : 추상화, 캡슐화, 상속, 다형성
>     - 장점 : 코드 재사용성, 간편한 유지보수, 큰 규모의 프로그래밍에 유리
>     - 단점 : 비교적 느린 속도, 높은 설계역량 요구, 코드의 잠재적인 복잡성  
>       2-1. 추상화, 캡슐화, 상속, 다형성
>     - 추상화 (Abstraction)
>     - 캡슐화 (Encapsulation)
>     - 상속 (Inheritance)
>     - 다형성 (Polymorphism)

> 3.  Instance : 메모리 공간을 확보하는 기준
>     -   Main memory 에서 생성됨
>     -   class는 define만 되고 실행한 이후에 generate 되면서 instance가 만들어짐

> 4.  disk : 프로그램이 돌아가는 곳

> 5.  API : 가져와서 실행하고자 하는 함수의 이름, 정의
>     -   다른 사람의 Package를 Import 해서 사용하며, Package 안에 class가 있음
>     -   many classes and methods

> 6. Constructor : 객체가 처음 생성될 때 호출되어 멤버 변수를 초기화하고, 필요에 따라 자원을 할당하는 것

> 7. Interfaces (자세히 정의하기 과제)

CBD, Instance, OS, Heap Area, Cache memory, Register, API, API의 I(interface), xxx’let’ : life cycle이 있도록 프로그램을 짜주는 것 (ex. Applet, Midlet, Servlet etc.), RML, RMI (method invocation), CORBA, JDBC, RPC, Byte code, multi threads, event handling for GUI,interfaces (API 에서 왜 interface라는 단어를 썼을지 과제 -> 다른 사람이 짠 코드의 함수 호출을 위함), constructor(생성자)

#### Java Keyword (과제 제출해야할 용어들, 키워드 나열 말고 class를 가운데 두고 상하좌우로 정리)

| 위치 |                                              java keyword                                              |
| :--: | :----------------------------------------------------------------------------------------------------: |
|  상  |                        package, import (객체랑 관계 없이 프로그램을 위한 것들)                         |
|  하  | 상속의 조건 : static, final / 객체의 생성 : new / 객체의 지칭 : this, super / 객체의 타입 : instanceof |
| 중심 |                                     객체의 구성 : class, interface                                     |
|  좌  |                             객체의 접근 기준 : public, private, protected                              |
|  우  |                                       상속 : extends, implements                                       |

#### Java 내의 예외처리 관련 keywords

-   try
    -   한번은 예외가 발생할 수 있는 함수를 실행함
-   catch
    -   함수 실행 중 예외가 발생되면 실행 함
-   finally
    -   필요 시 무조건 실행 함
-   throws( Exception Type )
-   throw
