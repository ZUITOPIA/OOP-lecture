class LearningStudent {
    public static void main (String[] args){
        System.out.println("This is a class for learning management!");

        LearningInfo student1 = new LearningInfo("JUHEE KO", 3, 100); // 학생 1의 이름, 반, 점수 정보
        student1.check(); // 학생 1의 이름, 반, 점수 정보 확인

        System.out.println("--- Whether or not to apply for consultation ---"); // 학습 컨설팅 여부

        LearningConsulting student2 = new LearningConsulting(1912943, true); // 학번 1912943 인 학생은 컨설팅에 참여함
        student2.apply();

        LearningConsulting student3 = new LearningConsulting(2323233, false); // 학번 2323233 인 학생은 컨설팅에 참여하지 않음
        student3.apply();

        student1.delete(); // 학생 1 지우기

    }
}