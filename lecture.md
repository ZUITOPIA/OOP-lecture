---
###### 코딩을 잘한다는 것
###### -> 내가 구현한 코드의 ‘비즈니스 로직’을 알고, ‘API’ 많이 아는 것, 디버깅을 잘하는 것
---

##### 첫번째 과제를 위한

## 코드 동작 원리

-   main memory 공간 확보, CPU 할당 받은 이후에 프로그램 동작
    -   main memory의 Heap area (heap sort 이용)
    -   class, object, instance가 main memory에 만들어지는 것이 중요한 것
-   disk -> main memory -> CPU ( Cache memory + register ) => OS가 관리
-   Java 에서의 OS는 JVM

## 프로그램 원리

-   compiler behavior vs runtime behavior (자바는 둘 다 가지고 있음)

    -   compiler behavior
        -   컴파일 시에 '미리' 필요한 공간을 확보, 메모리 할당 해 둠
            -   ex. c언어 malloc() : 일종의 동적 메모리 할당
    -   runtime behavior
        -   Runtime executive 사용
        -   실제로 '실행되면서' 필요한 변수와 공간을 확보하는 방식
        -   동적 메모리 할당 (Heap Area)

-   compiler vs interpreter
    -   javac : (compiler) / java : (interpreter)

# 내용 정리

1. Java 는 객체 지향 언어이기 때문에 유지보수에 용이함
2. Java는 JVM을 통해 실행되기 때문에 운영체제에 상관 없이 실행될 수 있는 독립적인 특성이 있으며, 자동으로 메모리 관리가 가능하고, 안정적인 프로그래밍을 할 수 있음
3. Object orient paradigm -> component(CBD) -> class -> 재활용
4. file과 class 이름은 항상 대문자, method와 member field(변수) 이름은 항상 소문자
5. file 이름 띄어쓰기 금지, 숫자 먼저 금지
6. class, method, variable 이름 똑같아도 에러는 안 남, but 혼동되니 이름 다 다르게 설정
7. class name, variable name : 명사 / method namd : 동사 + 명사(목적어)
8. Constructor buffer : N개 (사용에 따라 다르기 때문에 엄청 많음)
9. 자바는 compiler와 interpreter 다 사용

---

##### 두번째 과제를 위한

Exception - Error(프로그램, 개발자 책임) / Failure(소프트웨어, 인프라 구축하는 사람이 책임) / Fault(하드웨어)

API 란?

-   Interface : Programming에서 필요한 기능/절차 등에 대한 호출 규약

    -   규약(rule) : 호출할 함수의 이름, 입력 변수의 형식(type)과 개수 등을 정의
        -   cf. overloading (자바에서는 하나의 메소드 이름으로 여러 기능을 구현하기 때문)
    -   혼자 개발할 때는 필요 X, 여러 명이 개발할 때 필요 O
    -   ex. print(), print("string"), print("string", format)

    -   interface design (인터페이스 설계) : Programming에서 필요한 기능/절차 정의

    -> Function (functioin call 함수 호출)
    -> Procedure (procedure call 함수 호출, local procedure call)

        -   대표적인 예 : C언어의 RPC(Remote Procedure Call 원격 함수 호출)

-   Software engineering 관점에서는 Module이 중요 -> function, procedure
-   Java (객체지향언어)에서는 function, procedure를 Method로 정의함
-   Method : object instance 에 의해 호출됨
    -   method calling 의 원리 : method invocation(해당 함수를 실행시키는 것)
        -   ex. ECA -> overloading 때문
-   instance : 클래스로부터 생성된 객체, 힙 메모리에 멤버 변수의 크기에 따라 메모리가 생성됨
