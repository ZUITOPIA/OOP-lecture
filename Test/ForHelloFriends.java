class ForHelloFriends {
    public static void main (String args[]){
        System.out.print("Hello ");
        for (String name : args){ // 조건 없이 for 문 실행시키고 싶을 때
            System.out.print(name);
            System.out.print(" ");
        }
        System.out.println();
    }
}