// 1912943 Lab 1-4 실습

package PenP;

public class Pen4 {
    String vender;
    String color;
    int price;

    public Pen4() {  }

    public Pen4(String name){
        vender = name;
    }

    public Pen4(String name, String col, int pp){
        vender = name;
        color = col;
        price = pp;
    }

    void write(){
        System.out.println("Pen: write()");
        System.out.println("Pen Vender : " + vender);
        System.out.println(", Pen Color : " + color);
        System.out.println(", Pen Price : " + price);
    }

    void write(int xx){
        System.out.println("Pen: write(int xx)");
        System.out.println("Pen Vender : " + vender);
        System.out.println(", Pen Color : " + color);
        System.out.println(", Pen Price : " + xx);
    }

    void write(int xx, String yy){
        System.out.println("Pen: write(int xx)");
        System.out.println("Pen Vender : " + yy);
        System.out.println(", Pen Color : " + color);
        System.out.println(", Pen Price : " + xx);
    }

    void erase(){
        System.out.println("Pen : erase()");
    }
}

