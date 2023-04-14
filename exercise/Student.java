// 1912943 고주희 2-1, 2-2 실습

class Student extends Members{
    String major; 
    Members members[];

    public Student(String name, String idnum, String major){
        super(name, idnum);
        this.major = major;
    }

    public void setMembers(Members sub[]){
        members = sub;
    }

    public void introduce(){
        System.out.println("Student \""+name +"\" in "+major+" major passionately studies OOP class ~"); // 학생 소개
    }
}