public class HouseCallby {
    public static void value(int a){
        a += 50;
        System.out.println("value() method: a = " +a);
    }

    public static void ref(House house){
        house.price -= 100;
        house.owner = "Me";
        System.out.println("refer () method: house.price = " + house.price + "\t house.owner = " + house.owner);
    }
}