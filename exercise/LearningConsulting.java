public class LearningConsulting {
    int number;  // 학번
    boolean whether;  // 학습 컨설팅 신청 여부

    public LearningConsulting(int n, boolean w){
        number = n;
        whether = w;
    }

    public void apply(){
        System.out.println(number + " -> " + whether);  // 학번 -> 신청했으면 true, 아니면 false 형식으로 보여주기
    }
}