// 1912943 고주희 2-1, 2-2 실습

class Members { 
    String name; // 이름
    String dept; // 부서
    String major; // 전공
    int id; // 번호

    public Members(String name, String dept){
        this.name = name; // 이름
        this.dept = dept; // 부서
    }

    public void setId(int id){
        this.id = id; // 번호
    }

    public void setMajor(String major){
        this.major = major; // 전공
    }

    public void introduce(){
        System.out.println("\tStudent \""+name + "\" is Teacher Yoon's disciple"); // 학생 소개
    }
}