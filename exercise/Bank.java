public class Bank{
    public static void main(String args[]){
        Account hong = new Account("홍길동");
        hong.deposit(30); // 정상

        try{
            hong.withdraw(15); // 15원 빼고 15원 남음
        } catch(InsufficientBalanceException in){
            in.printStackTrace();
        }
  
        catch(MalformedData me){
            me.printStackTrace();
        }
        catch(ReInputException re){
            re.printStackTrace();
        }
        hong.check();

        try{
            hong.withdraw(40); // 남은 금액에서 40원을 빼내기위해서는 예금 25원 모자람
        } catch(InsufficientBalanceException in){
            in.printStackTrace();
        }

        System.out.println("normal termination");
    }
}