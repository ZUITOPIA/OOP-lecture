// 1912943 고주희

class HouseCallbyTest {
    public static void main (String args[]){
        int a = 10;
        House myHouse = new House("Mother", 2000);

        System.out.println("Call-by-value");
        System.out.println("before calling : a = " + a);
        HouseCallby.value(a);
        System.out.println("after calling : a = " + a);

        System.out.println();
        System.out.println("Call-by-reference");
        System.out.println("before calling : myHouse.price = " + myHouse.price + "\t myHouse.owner = " + myHouse.owner);
        HouseCallby.ref(myHouse);
        System.out.println("after calling : myHouse.price = " + myHouse.price + "\t myHouse.owner = " + myHouse.owner);
    }
}