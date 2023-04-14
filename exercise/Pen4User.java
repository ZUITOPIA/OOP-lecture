// 1912943 고주희 Lab 1-4 실습

import PenP.Pen4; // PenP package의 Pen4 가져와서 사용하기

class Pen4User{
    public static void main(String[] args){
        System.out.println("Hello Pen!");

        Pen4 mypen = new Pen4("SMU", "Green", 1000); // mypen이라는 이름의 instance 생성

        mypen.erase();
        mypen.write(); // 기존 값 그대로 유지
        mypen.write(2000); // 1000에서 2000으로 변경
        mypen.write(3000, "Dept, IT Engineering"); // 1000에서 3000으로 변경, SMU에서 Dept, IT Engineering로 변경

    }
}