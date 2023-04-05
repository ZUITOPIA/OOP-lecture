public class Pen {
    String owner;
    String color;
    int price;

    public Pen(){
        
    }

    public Pen(String name){
        owner = name;
    }

    // public Pen(String c){
    //     color = c; 
    // }
    // name 이랑 구분 어려움

    public Pen(int value){
        price = value;
    }

    public Pen(String name, String c, int value){
        owner = name;
        price = value;
        color = c; // 전체 변수 초기화 할 때 한 번에
    }

    public void write(){
        System.out.println("Pen: write()");
        System.out.println("Pen: write() : owner -> " + owner);
        System.out.println("Pen: write() : color -> " + color);
        System.out.println("Pen: write() : price -> " + price);
    }
}