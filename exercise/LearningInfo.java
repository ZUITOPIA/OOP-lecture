public class LearningInfo {
    String name;  // 학생의 이름
    int group;   // 학생의 반
    int score;   // 학생의 점수

    public LearningInfo(String n, int g, int s){
        name = n;
        group = g;
        score = s;
    }

    public void check(){
        System.out.println("------------------");
        System.out.println("name : " + name);
        System.out.println("group : " + group);
        System.out.println("score : " + score);
        System.out.println("------------------");

    }

    public void delete(){
        System.out.println("----- delete -----");  // 학생 정보 삭제
    }
}

