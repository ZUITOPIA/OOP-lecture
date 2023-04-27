public class ReInputException extends RuntimeException {
    public ReInputException(){
        super("0원을 입력하셨습니다. 금액을 다시 입력해주세요.");
    }
}