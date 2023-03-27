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
