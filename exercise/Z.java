// 1912943 고주희 3-1 코드 이해

class Z extends Y {
    int i = 30;
    String msg = "I am a Z.";

    void print(){
        // System.out.println("z의 print"); 출력 흐름 이해를 돕기 위한 코드
        System.out.println(msg);
    }

    void play(){
        // System.out.println("z의 play"); 출력 흐름 이해를 돕기 위한 코드
        System.out.println("Play.." + msg);
    }

    void doZ(){
        // System.out.println("z의 doZ"); 출력 흐름 이해를 돕기 위한 코드
        System.out.println("do something in Z.");
    }

    void test(int i){
        Z z = new Z(); 
        Y y = z;
        X x = z;

        z.print();  // I am a Z            > Z
        y.print();  // I am a Z            > Z
        super.print(); // I am a Y         > 현재 super는 Y를 가리킴 
                                           // class Z는 Y를 참조했기 때문에 class Y에서 print() 실행하는 것과 같음, 바로 위 참조에서 실행하고자하는 함수 print()가 존재하면 그것이 super가 됨
        play(); // Play.. I am a Z         > extends한 Z
        super.play(); // Play.. I am a X   > 현재 super는 X를 가리킴
                                           // class Z는 Y를 참조했고, class Y는 X를 참조했는데 Z가 참조한 Y에는 play()가 없고, Z가 참조한 Y가 참조한 X에 play()가 존재하여 class X의 play()를 실행하는 것과 같음

        // y.doZ();                  > 컴파일 에러 : y는 Y를 상속받기 때문 (class Z에 있는 doZ()는 class Y에 존재하지 않음, 만약 class Y에 doZ()가 존재했다면 컴파일 에러나지 않았을 것)
 
        // super.super.print();      > 컴파일 에러 : 캡슐화 위반, 부모클래스의 처리를 우회하게 만듦

        // X = 10, Y = 20, Z = 30
        System.out.println("\ni = "+i); // 15                     > test()의 변수로 15를 대입했기 때문
        System.out.println("this i = "+ this.i); // 30            > this는 Z를 가리킴
        System.out.println("super.i = "+ super.i); // 20          > super는 Y를 가리킴 (extends Y 했기 때문에)
        System.out.println("y.i = "+ y.i); // 20                  > Y의 i는 20
        System.out.println("x.i = "+ x.i); // 10                  > X의 i는 10
        System.out.println("((Y)this).i = "+ ((Y)this).i); // 20  > Y의 i는 20
        System.out.println("((X)this).i = "+ ((X)this).i); // 10  > X의 i는 10
        // super.super.i = 10;      > 컴파일 에러 : 캡슐화 위반, 부모클래스의 처리를 우회하게 만듦
        
    }
}