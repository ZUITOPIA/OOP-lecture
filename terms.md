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

> 8. Instance : 메모리 공간을 확보하는 기준
>     - Main memory 에서 생성됨
>
> -   class는 define만 되고 실행한 이후에 generate 되면서 instance가 만들어짐
> -   객체를 소프트웨어에 실체화 한 것, 실체화 된 instance 는 메모리에 할당됨
> -   OOP의 관점에서 객체가 메모리에 할당되어 실제 사용될 때 instance라 부름
>
> ### Class vs Object
>
> -   Class : 설계도
> -   Object : 설계도로 구현한 모든 대상을 의미함
>
> ### Object vs Instance
>
> -   Object : Class 타입으로 선언되었을 때
> -   Instance : 그 Object 가 메모리에 할당되어 실제 사용될 때
> -   Object 는 실체, Instance 는 관계에 초점을 맞춤
> -   Object 를 Class의 Instance 라고도 부름

> 9. Heap
>
> -   힙 메모리 영역
> -   참조형(Reference Type)의 데이터 타입을 갖는 Object(Instance), Array 등이 저장되는 영역
> -   변수(객체, 객체변수, 참조변수)는 Stack 영역의 공간에서 실제 데이터가 저장된 Heap 영역의 참조 값(reference value, 해시코드 / 메모리에 저장된 주소를 연결해주는 값)을 new 연산자를 통해 return 받음
> -   실제 데이터를 갖고 있는 Heap 영역의 참조 값을 Stack 영역의 객체가 갖고 있음
> -   Return 받은 참조 값을 갖고 있는 객체를 통해서만 해당 instance 를 handle 할 수 있음
>     참고
> -   Heap 영역에 저장된 data가 더 이상 불필요하다면 메모리 관리를 위해 JVW(Java Virtual Machine)에 의해 알아서 해제 됨 => GC(Garbage collection)

> 10. Stack
>
> -   스택 메모리 영역
> -   Method 내에서 정의하는 기본 자료형(int, double, byte, long, boolean 등)에 해당되는 지역 변수(매개 변수 및 블럭문 내 변수 포함)의 데이터의 값이 저장되는 영역
> -   해당 메소드가 호출될 때 메모리에 할당되고 종료되면 메모리가 해제됨
> -   LIFO(Last In First Out)의 구조
> -   변수에 새로운 데이터가 할당되면 이전 데이터는 지워짐

> 11. Segment
>
> ### Text Segment or Code Segment (.code)
>
> -   CPU가 읽어 해설할 수 있는 기계어들이 위치하게 되는 영역
> -   작성한 메인 프로그램의 기계어 코드가 위치하는 영역
> -   실행 가능한 명령어(Instruction)이 포함된 오브젝트 파일 또는 메모리 공간을 할당 받은 프로그램 섹션 중 하나
> -   프로그램을 실행시킬 때 각각의 함수들이 변경되면 안 되기 때문에 Read-Only인 경우가 많음
> -   Heap과 Stack에 의해 메모리 공간이 덮어 씌워지지 않도록 일반적으로 Heap , Stack 메모리 공간 아래에 위치함
> -   프로세스가 종료될 때까지 유지되는 영역
> -   보통 첫번째로 실행 가능한 명령어는 segment의 맨 처음에 위치하며, OS는 프로그램 실행을 시작하기 위해 그 위치를 알고 있음
> -   Code Segment(CS) 레지스터는 Code Segment의 주소를 의미함
> -   코딩한 것을 실행시키면 CPU가 알아서 코드영역에 저장된 명령어들을 하나씩 가져가 처리하는 방식으로 프로그램을 실행함
>
> ### Initialized Data Segment (.data)
>
> -   프로그램의 가상 주소 공간의 일부분
> -   초기화된 전역 변수와 Static 정적 변수를 포함함
> -   Initialized Read-Only Area vs Initial Read-Write Area
>
> ### Initial Read-Write Area : 변수에 접근 가능, 값 변경 가능
>
> ### Uninitialized Data Segment (.bss)
>
> -   초기화되지 않은 data segment => BSS Segment라 불림
> -   BSS란 Block Started by Symbol의 줄임말
> -   BSS Segment 의 data는 프로그램의 실행과 함께 커널(스타트업 코드)에 의해 0으로 초기화 됨
> -   초기화 되지 않은 데이터는 data segment 공간의 끝에서 시작되며 명시적인 초기화가 없는 모든 전역 변수와 Static 정적 변수를 포함함
>
> ### Stack, Heap

###### 용어 모음

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
