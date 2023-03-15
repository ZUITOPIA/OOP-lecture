---
## 코딩을 잘한다는 것

-> 내가 구현한 코드의 ‘비즈니스 로직’을 알고, ‘API’ 많이 아는 것, 디버깅 잘하는 것
---

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
4. file과 class 이름은 항상 대문자, method와 member field 이름은 항상 소문자
5. method 이름은 동사+목적어
6. Constructor buffer : N개 (사용에 따라 다르기 때문에 엄청 많음)
7. 자바는 compiler와 interpreter 다 사용
