// 1912943 Lab 1-4 실습

package PenP; // 펜 관련 패키지 불러오기

public class Pen4 {
    String vender; // 펜 판매자
    String color; // 펜 색상
    int price; // 펜 가격

    public Pen4() {  }

    public Pen4(String name){
        // 변수로 이름만 받을 수 있음
        vender = name; 
    }

    public Pen4(String name, String col, int pp){
        // 변수로 이름, 색상, 가격 세개 받을 수 있음
        vender = name; 
        color = col;
        price = pp;
    }

    public void write(){
        System.out.println("Pen: write()");
        System.out.println("Pen Vender : " + vender);
        System.out.println(", Pen Color : " + color);
        System.out.println(", Pen Price : " + price);
    }

    public void write(int xx){
        System.out.println("Pen: write()");
        System.out.println("Pen Vender : " + vender);
        System.out.println(", Pen Color : " + color);
        System.out.println(", Pen Price : " + xx); // xx라는 이름으로 price를 입력받아도 결과는 같음
    }

    public void write(int xx, String yy){
        System.out.println("Pen: write()");
        System.out.println("Pen Vender : " + yy); // yy라는 이름으로 vender를 입력받아도 결과는 같음
        System.out.println(", Pen Color : " + color);
        System.out.println(", Pen Price : " + xx); 
    }

    public void erase(){
        System.out.println("Pen : erase()");
    }
}

