// 1912943 고주희 2-1, 2-2 실습

class Teacher extends Members{
    String dept; 
    Members members[];

    public Teacher(String name, String idnum, String dept){
        super(name, idnum);
        this.dept = dept;
    }

    public void setMembers(Members sub[]){
        members = sub;
    }

    public void introduction(){
        System.out.println("Teacher \""+name +"\" in "+dept+" dept passionately teaches OOP class !!"); // 선생님 소개
    }
}