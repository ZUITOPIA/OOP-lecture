// 1912943 고주희 2-1, 2-2 실습

class School {
    Teacher yiyoon;
    Student ko, jeon, kim, bak;
    Members members[];

    public School(){
        yiyoon = new Teacher("Yoon", "M10313", "IT 공학전공");
        ko = new Student("Ko","1912943","IT");
        jeon = new Student("Jeon","1900000", "IT");
        kim = new Student("Kim","1900001", "IT");
        bak = new Student("Bak","1900002", "IT");

        members = new Members[5];
        members[0] = yiyoon;
        members[1] = ko;
        members[2] = jeon;
        members[3] = kim;
        members[4] = bak;
    }

    public void doIntroduction(){
        int n = members.length;
        for (int i=0; i<n; i++){
            members[i].introduction(); // 멤버의 수 만큼 소개할 수 있도록
        }
    }

    public static void main(String args[]){
        School mycom = new School();
        mycom.doIntroduction(); // 메인 함수 결과 출력
    }
}