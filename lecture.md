1. Java 는 객체 지향 언어이기 때문에 유지보수에 용이함
2. Java는 JVM을 통해 실행되기 때문에 운영체제에 상관 없이 실행될 수 있는 독립적인 특성이 있으며, 자동으로 메모리 관리가 가능하고, 안정적인 프로그래밍을 할 수 있음
3. Object orient paradigm -> component(CBD) -> class -> 재활용

# 프로그램 원리

-   compiler behavior vs runtime behavior
-   compiler behavior : 미리 필요한 공간을 확보, 메모리 할당 해 둠 (ex. C언어)
-   runtime behavior : Runtime executive 사용

#### 코드 동작 원리

-   main memory 공간 확보, CPU 할당 받은 이후에 프로그램 동작
    -   main memory의 Heap area (heap sort 이용)
    -   class, object, instance가 main memory에 만들어지는 것이 중요한 것
-   disk -> main memory -> CPU ( Cache memory + register ) => OS가 관리
-   Java 에서의 OS는 JVM

#### 용어

-   Instance : 메모리 공간을 확보하는 기준
    -   Main memory 에서 생성됨
    -   class는 define만 되고 실행한 이후에 generate 되면서 instance가 만들어짐
-   disk : 프로그램이 돌아가는 곳
-   API : 가져와서 실행하고자 하는 함수의 이름, 정의
    -   다른 사람의 Package를 Import 해서 사용하며, Package 안에 class가 있음

---

## 코딩을 잘한다는 것

-> 내가 구현한 코드의 ‘비즈니스 로직’을 알고, ‘API’ 많이 아는 것, 디버깅 잘하는 것
