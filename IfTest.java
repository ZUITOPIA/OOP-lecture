class IfTest{
    public static void main (String args[]){
        System.out.print("Hello ");
        if (args.length > 0){
            System.out.println(args[0]);
        } else {
            System.out.println("?????");
        }
    }
}

// 코드가 변경될때마다 javac로 매번 컴파일 해주어야함