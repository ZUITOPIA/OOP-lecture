class Y extends X {
    int i = 20;
    String msg = "I am a Y";

    void print(){
        System.out.println("y의 print");
        System.out.println(msg);
    }

    void doY(){
        System.out.println("y의 doY");
        System.out.println("do something in Y.");
    }
}